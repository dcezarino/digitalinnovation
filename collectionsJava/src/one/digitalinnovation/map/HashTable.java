package one.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<String, Integer> estudantes = new Hashtable<>();

		// Adiciona os campeões mundiais fifa no mapa
		estudantes.put("Carlos", 21);
		estudantes.put("Mariana", 33);
		estudantes.put("Rafaela", 18);
		estudantes.put("Pedro", 44);

		System.out.println(estudantes);

		estudantes.put("Pedro", 55);

		System.out.println(estudantes);

		// Remove um estudante no índice 0
		estudantes.remove("Pedro");

		System.out.println(estudantes);

		// Recupera um estudante no índice 2
		int idadeEstudante = estudantes.get("Mariana");
		;

		System.out.println(idadeEstudante);

		System.out.println(estudantes.size());

		// Navega nos registros do mapa
		for (Map.Entry<String, Integer> estudante : estudantes.entrySet()) {
			System.out.println(estudante.getKey() + " - " + estudante.getValue());
		}

		// Navega nos registros do mapa
		for (String estudante : estudantes.keySet()) {
			System.out.println("key: " + " - " + estudantes.get(estudante));

		}

		System.out.println(estudantes);

	}

}
