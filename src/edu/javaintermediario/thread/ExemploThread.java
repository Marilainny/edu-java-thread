package edu.javaintermediario.thread;

public class ExemploThread {

	public static void main(String[] args) {
		
		StatusBarraDeCarregamento statusBarraDeCarregamento = new StatusBarraDeCarregamento();
		
		StatusBarraDeCarregamento statusBarraDeCarregamentoNew = new StatusBarraDeCarregamento();
		
		BarraDeCarregamentoRun barraDeCarregamento = new BarraDeCarregamentoRun();
		
		BarraDeCarregamentoRun barraDeCarregamentoNew = new BarraDeCarregamentoRun();
		
				
		//iniciar o processo da Thread
		statusBarraDeCarregamento.start();
		statusBarraDeCarregamentoNew.start();
		
		//iniciar o processo da Runnable
		barraDeCarregamento.run();
		barraDeCarregamentoNew.run();
		
		/*
		 * Executar a thread de forma assicrona;
		 * As duas classes extends a classe Thread;
		 * As duas tem o método run();
		 */		
		GeradorPDF iniciarGerarPDF = new GeradorPDF();
		BarraDeCarregamento iniciarBarradeCarregamento = new BarraDeCarregamento(iniciarGerarPDF);
		
		iniciarGerarPDF.start();
		iniciarBarradeCarregamento.start();

	}

}
