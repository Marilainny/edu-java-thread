package edu.javaintermediario.thread;
/**
* A classe BarraDeCarregamento tem o objetivo de apresentar o uso de Threads 
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     04.06.2022
* @implNote  Exemplo			 
*/
public class BarraDeCarregamento extends Thread{
	
	private Thread iniciarGeradorPDF;
	
	public BarraDeCarregamento(Thread iniciarGeradorDePDF) {
		this.iniciarGeradorPDF = iniciarGeradorDePDF;
	}
	
	@Override
	public void run() {
		
		//enquanto a condição for verdadeira
		while(true) {
			try {
				//período para aguardar a Thread GeradorPDF.
				Thread.sleep(500);	
								
				/*
				 * enquanto o processo estiver rodando,
				 * a barra de carreguento continua,
				 * ao finalizar termina a execução.
				 */
				if (!iniciarGeradorPDF.isAlive()) {
					break;					
				}
								
			} catch (Exception e) {
				// TODO: handle exception
			}		
		
			System.out.println("Loading...");
		}
		
			
	}
}
