package edu.javaintermediario.threadCasa;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class ArrumarCasaMain {

	public static void main(String[] args) throws InterruptedException {

		// instanciar os comodos da casa
		Casa comodoQuarto = new Casa(new Quarto());
		Casa comodoSala = new Casa(new Sala());

		/*
		 * obter a lista a fazer dos comodos da casa, 
		 * solicitar o comando de executar o pool thread
		 * serão realizado apenas 3 thread a cada processo.
		 */
		comodoQuarto.obterAfazeresDaCasa().forEach(atividade -> 
		ArrumarCasa.getThreadpool().execute(() -> atividade.realizarAtividade()));

		/*Usando o submit para pegar um retorno, no lugar do comando execute.
		 * extends Future para capturar reposta
		 * colocar dentro da CopyOnwriteArrayList,
		 *  devido a parte de remove item da lista, lista segura.
		 */
		List<? extends Future<?>> futures =
				new CopyOnWriteArrayList<>(comodoSala.obterAfazeresDaCasa().stream()
						.map(atividade -> ArrumarCasa.getThreadpool().submit(() -> atividade.realizarAtividade()))
						.collect(Collectors.toList()));

		while(futures.stream().allMatch(Future::isDone)) {

			for(Future<?>futuro : futures) {				
				if(futuro.isDone()) {					
					System.out.println("Tarefa finalizada!");						
					futures.remove(futuro);
				}else {
				}

				System.out.println("Atividades não finalizadas");
				Thread.sleep(500);
			};			
		}

		ArrumarCasa.getThreadpool().shutdown();
	}

}
