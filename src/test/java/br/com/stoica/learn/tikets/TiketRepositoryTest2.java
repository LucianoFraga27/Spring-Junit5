package br.com.stoica.learn.tikets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@DataJpaTest
class TiketRepositoryTest2 {

	private static final String DEV_NOME = "Luciano Lucas";
	private static final String DEV_EMAIL= "lucianolucas@email.com.br";
	
	private static final Ticket GIVEN_TICKET__INITIAL = new Ticket(
			"Criar relatório mensal de vendas",
			"Coelho da Disney",
			"coelho.disney@cliente.mail",
			DEV_NOME,
			DEV_EMAIL,
			"Criar relatório mensal de vendas"
			); 
	

}
