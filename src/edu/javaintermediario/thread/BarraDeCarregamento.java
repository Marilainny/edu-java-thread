package edu.javaintermediario.thread;

public class BarraDeCarregamento extends Thread{
	
	private Thread iniciarGeradorPDF;
	
	public BarraDeCarregamento(Thread iniciarGeradorDePDF) {
		this.iniciarGeradorPDF = iniciarGeradorDePDF;
	}
	
	@Override
	public void run() {
		
		//enquanto a condi��o for verdadeira
		while(true) {
			try {
				//per�odo para aguardar a Thread GeradorPDF.
				Thread.sleep(500);	
								
				/*
				 * enquanto o processo estiver rodando,
				 * a barra de carreguento continua,
				 * ao finalizar termina a execu��o.
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
