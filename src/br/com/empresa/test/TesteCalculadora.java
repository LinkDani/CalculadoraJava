package br.com.empresa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.empresa.lib.Calculadora;

public class TesteCalculadora {

	@Test
	public void somaNumerosInteiros() {
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2, 3), 5, 0);
	}
	
	@Test
	public void somaNumeroscomVírgula() {
		Calculadora calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2.5, 3.5), 6, 0);
	}
	
	
	
}


