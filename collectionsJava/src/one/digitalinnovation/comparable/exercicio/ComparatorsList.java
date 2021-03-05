package one.digitalinnovation.comparable.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsList {

	public static void main(String[] args) {

		List<Professor> professores = new ArrayList<>();
		professores.add(new Professor("Caio", 25, 'M'));
		professores.add(new Professor("Bianca", 24, 'F'));
		professores.add(new Professor("Maria", 32, 'F'));
		professores.add(new Professor("João", 23, 'M'));
		professores.add(new Professor("Carol", 27, 'F'));

		System.out.println("Ordem de Inserção: ");
		System.out.println(professores);

		// Comparator
		professores.sort(Comparator.comparingInt(Professor::getIdade));
		System.out.println("Ordem natural dos números  - idade (method reference)");
		System.out.println(professores);

		// Comparator
		professores.sort(Comparator.comparingInt(Professor::getIdade).reversed());
		System.out.println("Ordem reversa dos números  - idade (method reference)");
		System.out.println(professores);

		// lambda
		Collections.sort(professores);
		System.out.println("Ordem natural dos números  - idade (method Comparable)");
		System.out.println(professores);

		// Comparable
		Collections.sort(professores, new ProfessorOrdemReversaComparator());
		System.out.println("Ordem reversa dos números  - idade (method Comparator)");
		System.out.println(professores);
	}

}
