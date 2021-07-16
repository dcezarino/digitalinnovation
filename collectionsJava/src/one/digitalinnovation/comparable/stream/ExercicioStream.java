package one.digitalinnovation.comparable.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import one.digitalinnovation.comparable.Estudante;

public class ExercicioStream {

	public static void main(String[] args) {

		List<Estudante> estudantes = new ArrayList<>();

		estudantes.add(new Estudante("Diego", 14));
		estudantes.add(new Estudante("Pablo", 15));
		estudantes.add(new Estudante("Maria", 18));
		estudantes.add(new Estudante("Joana", 19));
		estudantes.add(new Estudante("José", 45));
		estudantes.add(new Estudante("Bárbara", 15));

		System.out.println("Contagem: " + estudantes.stream().count());

		// Retorna os elementos que tem idade igual ou maior que 18 anos
		System.out.println("Idade maior ou igual a 18: " + estudantes.stream()
					.filter((estudante) -> estudante.getIdade() >= 18)
					.collect(Collectors.toList()));

		System.out.println(estudantes);

		// Retorna os elementos que tem a letra b no nome
		System.out.println("Com a letra B no nome: " + estudantes.stream()
				.filter((estudante) -> estudante.getNome().toLowerCase().contains("b"))
				.collect(Collectors.toList()));

		// Retorna se existe ao menos um estudante com a letra D no nome
		System.out.println("Existe ao menos um estudante com a letra D no nome?: " + estudantes.stream()
				.anyMatch((estudante) -> estudante.getNome().toUpperCase().contains("D")));						

	}

}
