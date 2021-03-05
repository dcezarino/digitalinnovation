package one.digitalinnovation.comparable.optional;

import java.util.Optional;
import java.util.Scanner;

public class ExercicioOptional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha a opção: ");
		System.out.println("Menu");
		System.out.println("[1]-Empty");
		System.out.println("[2]-Present");
		System.out.println("[3]-Null");
		Integer escolha = sc.nextInt();

		switch (escolha) {
		case 1:
			// Vazio
			Optional<Integer> optionalInteger = Optional.empty();

			optionalInteger.ifPresent(System.out::println);

			if (optionalInteger.isEmpty()) {
				optionalInteger.orElseThrow(IllegalStateException::new);
			}

			if (optionalInteger.isEmpty()) {
				System.out.println("Optional Vazio");
			}

			optionalInteger.ifPresent(System.out::println);

			if (optionalInteger.isPresent()) {
				Integer valor = optionalInteger.get();
				System.out.println(valor);
			}

			optionalInteger.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));
			break;

		case 2:
			Optional<Integer> optionalIntegerPresent = Optional.of(2000);

			optionalIntegerPresent.ifPresent(System.out::println);

			if (optionalIntegerPresent.isEmpty()) {
				optionalIntegerPresent.orElseThrow(IllegalStateException::new);
			}

			if (optionalIntegerPresent.isEmpty()) {
				System.out.println("Optional Vazio");
			}

			optionalIntegerPresent.ifPresent(System.out::println);

			if (optionalIntegerPresent.isPresent()) {
				Integer valor = optionalIntegerPresent.get();
				System.out.println(valor);
			}

			optionalIntegerPresent.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

			break;

		case 3:

			Optional<Integer> optionalIntegerNull = Optional.ofNullable(null);

			optionalIntegerNull.ifPresent(System.out::println);

			if (optionalIntegerNull.isEmpty()) {
				optionalIntegerNull.orElseThrow(IllegalStateException::new);
			}

			if (optionalIntegerNull.isEmpty()) {
				System.out.println("Optional Vazio");
			}

			optionalIntegerNull.ifPresent(System.out::println);

			if (optionalIntegerNull.isPresent()) {
				Integer valor = optionalIntegerNull.get();
				System.out.println(valor);
			}

			optionalIntegerNull.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

			break;

		default:
			break;
		}
		
		sc.close();

	}

}
