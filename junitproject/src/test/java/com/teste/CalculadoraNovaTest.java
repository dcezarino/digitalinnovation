package com.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraNovaTest {
	
	
	public void checkedSum() {
		
		CalculadoraNova calc = new CalculadoraNova();
		
		Double resultado = calc.somar(5.0, 5.0);
		
		assertEquals(10, resultado);
		
	}

}
