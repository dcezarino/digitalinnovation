package com.teste;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExcepetionTest {

	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		List<String> lista = new ArrayList<String>();
		lista.add("Cliente Modelo");

		lista.get(1);
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shoudlTestExceptionMessage() throws IndexOutOfBoundsException {
		List<Object> lista = new ArrayList<Object>();

		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index 0 out of bounds for length 0");
		lista.get(0);

	}

	@Test
	public void testExceptionMessage() throws IndexOutOfBoundsException {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperado que IndexOutOfBoundsException seja lançada");
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));

		}
	}

}
