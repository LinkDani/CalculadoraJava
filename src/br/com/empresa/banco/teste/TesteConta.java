package br.com.empresa.banco.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.empresa.banco.Conta;

public class TesteConta {

	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Marcelo", "2-2", "123-4");
	}

	@Test
	public void test() {
		assertEquals(conta.GetTitular(), "Marcelo");
		assertEquals(conta.GetSaldo(), 0, 0);
	}

}