package edu.javaintermediario.ParallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Exemplo utilizando execução serial e pararela, 
 * e o tempo de resposta de cada forma.  
 *   
 * @author  	 Marilainny Martins da Silva
 * @version 	 1.0
 * @since     05.06.2022
 * @implNote  Exemplo			 
 */
public class ParallelStreamMain {

	public static void main(String[] args) {

		//serial 
		long inicio = System.currentTimeMillis();
		IntStream.range(1, 1000000000).forEach(numero -> fatorial(numero));
		long fim = System.currentTimeMillis();

		System.out.println("Tempo de execução Serial: "+(fim - inicio));


		//paralelo

		inicio = System.currentTimeMillis();
		IntStream.range(1, 1000000000).parallel().forEach(numero -> fatorial(numero));
		fim = System.currentTimeMillis();
		
		System.out.println("Tempo de execução Paralelo: "+(fim - inicio));
		
		//lista
		List<String> nomes = Arrays.asList(
				"Júlia","Katrinny",	"Kássia","Karina",
				"Danilo","Leonardo","Davi",	"Daniel");
		
		nomes.parallelStream().forEach(System.out::println);
	
	}

	public static long fatorial(long numero) {
		long fatorial = 1;

		for(long i = 2; i <- numero; i++) {

			fatorial *= i;
		}

		return fatorial;
	}

}
