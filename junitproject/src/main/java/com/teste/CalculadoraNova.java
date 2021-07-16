package com.teste;

public class CalculadoraNova {

	public Double somar(Double... valores) {
		Double soma = 0.0;
		for (Double valor : valores) {
			soma += valor;
		}

		return soma;
	}

}
