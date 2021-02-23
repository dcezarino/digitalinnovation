package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {		
		
		
		// Keep insert order 
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

		// Add numbers on set
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);		
		
		System.out.println(sequenciaNumerica);

		// Remove numbers the set
		sequenciaNumerica.remove(4);
		System.out.println(sequenciaNumerica);

		// Returns the amount of items
		System.out.println(sequenciaNumerica.size());

		// Browse all items in the iterator
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator: " + iterator.next());
		}

		for (Integer nota : sequenciaNumerica) {
			System.out.println("for each: " + nota);
		}

		sequenciaNumerica.clear();

		System.out.println(sequenciaNumerica.isEmpty());

	}

}
