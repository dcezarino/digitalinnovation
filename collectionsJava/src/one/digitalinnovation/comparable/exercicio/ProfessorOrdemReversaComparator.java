package one.digitalinnovation.comparable.exercicio;

import java.util.Comparator;

public class ProfessorOrdemReversaComparator implements Comparator<Professor> {

	@Override
	public int compare(Professor o1, Professor o2) {
		return o2.getIdade() - o1.getIdade();
	}

}
