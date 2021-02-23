package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		Set<Double> notasAlunos = new HashSet<>();
		
		// Add students' grade on set
		notasAlunos.add(5.8);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);
		
		System.out.println(notasAlunos);
		
		// Remove students' grade in the set
		notasAlunos.remove(3.8);
		System.out.println(notasAlunos);
				
		// Returns the amount of items
		System.out.println(notasAlunos.size());
		
		// Browse all items in the iterator
		Iterator<Double> iterator = notasAlunos.iterator();
		while(iterator.hasNext()) {
			System.out.println("Iterator: " + iterator.next());			
		}
		
		for (Double nota : notasAlunos) {
			System.out.println("for each: " + nota);			
		}
		
		notasAlunos.clear();
		
		System.out.println(notasAlunos.isEmpty());		


	}

}
