package edu.javaintermediario.threadCasa;
/**
* A classe ArrumarCasa tem um método abstrato que executa um pool de tread
* utilizada para validar a quantidade de thread por processo. 
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     04.06.2022
* @implNote  Exemplo			 
*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrumarCasa {
	
	//limita o total de 3 thread a ser executa por processo.
	private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

	public static ExecutorService getThreadpool() {
		return threadPool;
	}

}
