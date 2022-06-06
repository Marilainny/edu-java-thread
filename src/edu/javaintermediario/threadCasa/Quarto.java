package edu.javaintermediario.threadCasa;

import java.util.Arrays;
import java.util.List;

public class Quarto extends Comodo{

	/*
	 * Cada comodo, implemeta a classe abstrata Comodo,
	 * Implementa suas atividades.
	 */
	@Override
	List<Atividade> obterAfazeresDoComodo() {	

		return Arrays.asList(
				this::arrumarCama, 
				this::varrerQuarto, 
				this::arrumarGuardaRoupa,
				this::separarRoupaSuja
				);	
	}

	private void arrumarCama() {
		System.out.println("Arrumar cama!");
	}

	private void varrerQuarto() {
		System.out.println("Varrer Quarto!");
	}

	private void arrumarGuardaRoupa() {
		System.out.println("Arrumar Guarda Roupa!");
	}
	
	private void separarRoupaSuja() {
		System.out.println("Separar Roupa Suja!");
	}
}
