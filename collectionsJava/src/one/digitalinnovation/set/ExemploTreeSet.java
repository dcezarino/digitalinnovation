package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		// Keep insert order
		TreeSet<String> treeCapitais = new TreeSet<>();

		// Create a tree with the capitals
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianópolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Rio de Janeiro");

		System.out.println(treeCapitais);

		// Returns the first capital at the top of the tree		
		System.out.println(treeCapitais.first());

		// Returns the last capital at the end of the tree
		System.out.println(treeCapitais.last());
		
		// Returns the first capital below in the parameterized capital tree
		System.out.println(treeCapitais.lower("Florianópolis"));
				
		// Returns the first capital below in the parameterized capital tree
		System.out.println(treeCapitais.higher("Florianópolis"));
		
		// Show all capitals on console
		System.out.println(treeCapitais);
		
		// Returns the first capital at the top of the tree and and removes it from the set
		System.out.println(treeCapitais.pollFirst());
		
		// Returns the first capital at the end of the tree and and removes it from the set
		System.out.println(treeCapitais.pollLast());
		
		// Show all capitals on console
		System.out.println(treeCapitais);		

		// Browse all items in the iterator
		Iterator<String> iterator = treeCapitais.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator: " + iterator.next());
		}

		for (String treeCapital : treeCapitais) {
			System.out.println("for each: " + treeCapital);
		}

		treeCapitais.clear();

		System.out.println(treeCapitais.isEmpty());

	}

}

