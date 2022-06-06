package edu.javaintermediario.thread;
/**
* A classe StatusBarraDeCarrregamento tem o objetivo de apresentar o uso de Threads 
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     04.06.2022
* @implNote  Exemplo			 
*/
public class StatusBarraDeCarregamento extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("rodou... "+this.getName());		
	}

}
