package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercicio {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeNumeros = new TreeSet<>();
		treeNumeros.add(3);
		treeNumeros.add(88);
		treeNumeros.add(20);
		treeNumeros.add(44);
		treeNumeros.add(3);
		
		Iterator<Integer> iterator = treeNumeros.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		
		treeNumeros.pollFirst();
		
		System.out.println(treeNumeros);
		
		treeNumeros.add(23);
		
		System.out.println(treeNumeros);
		
		System.out.println(treeNumeros.size());
				
		boolean tamanhoTreeSet = treeNumeros.isEmpty();
		System.out.println(tamanhoTreeSet);
		


	}

}

