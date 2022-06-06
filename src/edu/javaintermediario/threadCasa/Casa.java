package edu.javaintermediario.threadCasa;
/**
* A classe Casa tem uma lista de comodos,
* uma lista de tarefa para o comodo.
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     04.06.2022
* @implNote  Exemplo			 
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Casa {

	private List<Comodo> comodos;

	//a casa tem uma lista de comodos.
	Casa(Comodo... comodos){
		this.comodos = Arrays.asList(comodos);
	}

	//a casa tem uma lista de tarefa.
	List<Atividade> obterAfazeresDaCasa(){

		return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
				.reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {					
					pivo.addAll(atividades);
					return pivo;

				});		
	}

}
