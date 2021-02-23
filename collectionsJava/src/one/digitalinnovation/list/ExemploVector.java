package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {

		List<String> esportes = new Vector<>();

		// Includ four sports on vector
		esportes.add("Futebol");
		esportes.add("Basquetebol");
		esportes.add("Tênis de Mesa");
		esportes.add("Handebol");

		// Update the value on position two on vector
		esportes.set(2, "Ping Pong");

		// Remove the sport on position two
		esportes.remove(2);

		// Return the first item on vector
		System.out.println("Posição 0: " + esportes.get(0));	

		// Navigate on sports
		for (String esporte : esportes) {
			System.out.println(esporte);

		}

	}

}
