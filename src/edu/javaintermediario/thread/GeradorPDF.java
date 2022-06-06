package edu.javaintermediario.thread;

/**
* A classe GeradorPDF tem o objetivo de apresentar o uso de Threads 
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     04.06.2022
* @implNote  Exemplo			 
*/

public class GeradorPDF extends Thread{

	@Override
	public void run() {
		
		try {
			System.out.println("Gerar PDF.");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("PDF gerado.");

	}

}
