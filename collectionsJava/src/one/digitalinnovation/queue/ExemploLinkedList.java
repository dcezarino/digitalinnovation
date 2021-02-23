package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {

		Queue<String> filaDeBanco = new LinkedList<>();
		filaDeBanco.add("Pamela");
		filaDeBanco.add("Patrícia");
		filaDeBanco.add("Roberto");
		filaDeBanco.add("Flávio");
		filaDeBanco.add("Anderson");

		System.out.println(filaDeBanco);

		// Return the first element and remove it
		String clienteASerAtendido = filaDeBanco.poll();
		System.out.println(clienteASerAtendido);
		System.out.println(filaDeBanco);

		// Return the first element and doesn't remove it
		String primeiroCliente = filaDeBanco.peek();
		System.out.println(primeiroCliente);
		System.out.println(filaDeBanco);

		// Return the first element, doesn't remove it and show an exception case necessary
		// filaDeBanco.clear();
		String primeiroClienteOuErro = filaDeBanco.element();
		System.out.println(primeiroClienteOuErro);
		System.out.println(filaDeBanco);

		filaDeBanco.add("Wesley");

		for (String cliente : filaDeBanco) {
			System.out.println(cliente);
		}

		Iterator<String> iteratorFilaBanco = filaDeBanco.iterator();

		while (iteratorFilaBanco.hasNext()) {
			System.out.println("-> " + iteratorFilaBanco.next());
		}

		System.out.println(filaDeBanco.size());

		filaDeBanco.clear();

		System.out.println(filaDeBanco.isEmpty());

	}

}
