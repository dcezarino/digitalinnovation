package one.digitalinnovation.comparable.stream;

import java.util.ArrayList;
import java.util.List;

public class ExercicioStream {
	
	public static void main(String[] args) {
		
		
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Pedro");
		estudantes.add("Eduardo");
		estudantes.add("Maria");
		estudantes.add("José");
		estudantes.add("Carlos");
		estudantes.add("Caio");
		estudantes.add("Berto");
		
		System.out.println("Contagem: " + estudantes.stream().count());
		
		
		

		
	}

}
