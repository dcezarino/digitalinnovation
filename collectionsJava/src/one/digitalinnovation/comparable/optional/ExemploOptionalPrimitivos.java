package one.digitalinnovation.comparable.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
	
	public static void main(String[] args) {
		
		System.out.println("***Valor inteiro opcional***");
		Optional.of(12).ifPresent(System.out::println);
		
		System.out.println("***Valor decimal opcional***");
		OptionalDouble.of(55.2).ifPresent(System.out::println);		
		
		System.out.println("***Valor long opcional***");
		OptionalLong.of(12L).ifPresent(System.out::println);
		
	}

}
