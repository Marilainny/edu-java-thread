package edu.javaintermediario.thread;
/**
* A classe BarraDeCarregamento tem o objetivo de apresentar o uso de Threads 
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     04.06.2022
* @implNote  Exemplo			 
*/
public class BarraDeCarregamentoRun implements Runnable{

	@Override
	public void run() {
		System.out.println("Loading...");
		
	}

}
