package edu.javaintermediario.threadCasa;

import java.util.Arrays;
import java.util.List;

public class Sala extends Comodo{
	
	/*
	 * Cada comodo, implemeta a classe abstrata Comodo,
	 * Implementa suas atividades.
	 */
	@Override
	List<Atividade> obterAfazeresDoComodo() {	
			
		return Arrays.asList(
				this::limparSofa, 
				this::varrerTapete, 
				this::tirarPoeira
				);	
	}
	
	private void limparSofa() {
		System.out.println("Limpar sofá!");
	}
	
	private void varrerTapete() {
		System.out.println("Varrer Tapete");
	}
	
	private void tirarPoeira() {
		System.out.println("Tirar Poeira!");
	}

}
