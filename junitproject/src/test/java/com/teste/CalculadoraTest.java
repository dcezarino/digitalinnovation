package com.teste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		
		assertEquals(5, soma);
		
	}
	
	@Test
	public void testSomarComMock() {
		
		Calculadora calc = mock(Calculadora.class);
		
		when(calc.somar("1+2+1")).thenReturn(10);
		
		int resultado = calc.somar("1+2+1");
			
		assertEquals(10, resultado);
		
	}	
	
	

}
