package br.com.stoica.learn.tikets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@DataJpaTest
class TiketRepositoryTest {

	private static final String DEVELOPE_NAME = "Desenvolvedor Sagaz";
	private static final String DEVELOPE_EMAIL = "desenvolvedor.sagaz@empresa.mail";
	
	private static final Ticket GIVEN_TICKET__INITIAL = new Ticket(
			"Criar relatório mensal de vendas",
			"Coelho da Disney",
			"coelho.disney@cliente.mail",
			DEVELOPE_NAME,
			DEVELOPE_EMAIL,
			"Criar relatório mensal de vendas"
			); 
	
	
	@Autowired
	TiketRepository underTest;
	
	@Test
	void itShouldCheckIfOwnerEmailExists() {
		
		// Given : cENÁRIO DE TESTE
		
		underTest.save(GIVEN_TICKET__INITIAL);

		// When
		
		var response = underTest.ownerEmailExists(DEVELOPE_EMAIL);
		
		// Then : Validação
		
		assertThat(response).isGreaterThan(0l); // Extamente 1 email.
		
		
	}

}
