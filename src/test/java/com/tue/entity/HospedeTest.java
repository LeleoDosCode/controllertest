package com.tue.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {

private Hospede Hospede;
	
	//Arrange
	@BeforeEach
	void setUp() {
		Hospede = new Hospede(1L, "Victor Freitag","victor@gmail.com");
	}
	
	
	
	@Test
	@DisplayName("Tstando o getter e setter do campo Id")
	void testId() {
		//Action
		Hospede.setId(2L);
		
		//Assert
		assertEquals(2L, Hospede.getId());
	}
	@Test
	@DisplayName("Tstando o getter e setter do campo Nome")
	void testNome() {
		//Action
		Hospede.setName("Victor Freitag");
		Hospede.setEmail("victorfreitag@gmail.com");
		
		//AssertNum
	}
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
		//act
		Hospede  novoHospede = new Hospede(3L, "Leo","Leo@gmail.com");
		//Assert
		assertAll("novoHospede", 
				()-> assertEquals(3L, novoHospede.getId()),
				()-> assertEquals("João", novoHospede.getName()),
				()-> assertEquals("joao@gmail.com", novoHospede.getEmail())
				
				);
		
	}

};
