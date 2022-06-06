package edu.javaintermediario.threadCasa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ArrumarCasa {
	
	//limita o total de 3 thread a ser executa por processo.
	private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

	public static ExecutorService getThreadpool() {
		return threadPool;
	}

}
