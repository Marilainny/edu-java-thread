package edu.javaintermediario.threadCasa;
/**
* A classe Sala implementa as atividades que serão realizada
* Criar uma lista de atividades a ser executada.
*   
* @author  	 Marilainny Martins da Silva
* @version 	 1.0
* @since     04.06.2022
* @implNote  Exemplo			 
*/
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
