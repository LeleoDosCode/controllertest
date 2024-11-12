package com.tue.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tue.entity.Hospede;
import com.tue.repository.HospedeRepository;

class HospedeServiceTest {

	@Autowired
	private HospedeService hospedeService;
	@Autowired
	private HospedeRepository hospedeRepository;

	@BeforeEach
	void serUp() {
		hospedeRepository.deleteAll();
	}

	@DisplayName("Testando salvar Hóspede")
	@Test
	void testSalvarHospede() {
		Hospede hospede = new Hospede(null, "Julia Maria", "julia@gmail.com");
		Hospede resultado = hospedeService.salvarHospede(hospede);
		assertNotNull(resultado);
		assertNotNull("Julia Maria", resultado.getName());
		assertNotNull(resultado.getId() > 0);
	}

	@DisplayName("Testando listar todos os Hóspede")
	@Test
	void testListarTodos() {
		Hospede hospede1 = new Hospede(null, "Julia Maria", "julia@gmail.com");
		Hospede hospede2 = new Hospede(null, "Julia Maria", "julia@gmail.com");
		hospedeService.salvarHospede(hospede1);
		hospedeService.salvarHospede(hospede2);
		List<Hospede> resultado = hospedeService.getAllHospede();
		assertNotNull(resultado);
		assertEquals(2, resultado.size());
	}
}
