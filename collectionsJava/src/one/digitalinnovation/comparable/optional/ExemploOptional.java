package one.digitalinnovation.comparable.optional;

import java.util.Optional;

public class ExemploOptional {

	public static void main(String[] args) {

		// Valida se o optionalString está presente (true/false)
		Optional<String> optionalString = Optional.of("Valor Opcional");
		System.out.println(optionalString.isPresent());

		// Imprime no console o valor se presente
		optionalString.ifPresent(System.out::println);

		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente"));

		if (optionalString.isPresent()) {
			String valor = optionalString.get();
			System.out.println(valor);
		}

		optionalString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
		optionalString.orElseThrow(IllegalStateException::new);

	}

}
