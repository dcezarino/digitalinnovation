package com.teste;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AssertJTest {
	
	@Test
	public void checkEquality() {
		Person person = new Person("Cliente", "Modelo 1");
		Person personClone = person;
		assertThat(person).isEqualTo(personClone);		
	}
	
	
	

}
