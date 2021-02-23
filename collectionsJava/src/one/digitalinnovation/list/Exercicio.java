package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");

		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}

		nomes.set(2, "Renato");

		System.out.println("Posiçao 1: " + nomes.get(1));
		System.out.println("Posiçao 4: " + nomes.get(4));

		nomes.remove("João");

		System.out.println("Quantidade da Lista: " + nomes.size());

		boolean temJuliano = nomes.contains("Juliana");
		System.out.println("Tem Juliano: " + temJuliano);

		List<String> nomesListaDois = new ArrayList<>();
		nomesListaDois.add("Ismael");
		nomesListaDois.add("Rodrigo");
		
		nomes.addAll(nomesListaDois);		

//		for (String nomeListaDois : nomesListaDois) {
//			nomes.add(nomeListaDois);
//		}

		Collections.sort(nomes);

		System.out.println(nomes);

		boolean isEmpty = nomes.isEmpty();
		System.out.println(isEmpty);

	}

}
