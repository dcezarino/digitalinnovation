package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("João");
		
		for (String cliente : fila) {			
			System.out.println("-> " + cliente);			
		}
		
		Iterator<String> iteratorFila = fila.iterator();
		while(iteratorFila.hasNext()) {
			System.out.println(iteratorFila.next());
		}		
		
		String primeiroDaFila = fila.peek();
		System.out.println(primeiroDaFila);
		System.out.println(fila);
		
		String removePrimeiroFila = fila.poll();
		System.out.println(removePrimeiroFila);
		System.out.println(fila);
		
		fila.add("Daniel");
		
		System.out.println(fila);
		
		System.out.println("Tamanho da Lista:" + fila.size());
		
		//fila.clear();
		System.out.println(fila.isEmpty());
		
		System.out.println(fila.contains("Carlos"));
		
	}

}
