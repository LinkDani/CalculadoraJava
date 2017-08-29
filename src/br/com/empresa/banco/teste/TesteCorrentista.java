package br.com.empresa.banco.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.empresa.banco.Correntista;

public class TesteCorrentista {
private Correntista correntista;
	
	@Before
	public void before() {
		correntista = new Correntista("Marcelo", "123.123.123-12");
	}

	@Test
	public void test() {
		assertEquals(correntista.GetNome(), "Marcelo");
		assertEquals(correntista.GetCPF(), "123.123.123-12");
	}

	}
