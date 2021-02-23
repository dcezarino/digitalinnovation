package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Zelado");
		nomes.add("Pedro");
		nomes.add("Ana");
		nomes.add("Maria");
		nomes.add("João");
		
		System.out.println(nomes);
		
		nomes.set(2, "Fabiana");
		
		// Ordered names list 
		Collections.sort(nomes);
			
		System.out.println(nomes);
		
		nomes.remove(0);
		System.out.println(nomes);
		
		nomes.remove("Ana");
		System.out.println(nomes);
		
		for(String nome : nomes) {
			
			System.out.println("Nome: " + nome);
		}
		
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()) {
			System.out.println("->" + iterator.next());
		}
	
		String nome = nomes.get(1);
		System.out.println(nome);
		
		// if return is -1 the element isn't contained on list
		int posicao = nomes.indexOf("Pedro");
		System.out.println("Posição: " + posicao);		
		
		int tamanho = nomes.size();
		System.out.println(tamanho);
		
		boolean temMaria = nomes.contains("Maria");
		System.out.println(temMaria);

		nomes.clear();
		
		System.out.println(nomes);
		
		boolean isEmpty = nomes.isEmpty();
		System.out.println(isEmpty);		
		
		
		
	}

}
