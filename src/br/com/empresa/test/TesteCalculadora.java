package br.com.empresa.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.empresa.lib.Calculadora;

public class TesteCalculadora {
	private Calculadora calculadora;
	
	@Before
	public void before() {
		calculadora = new Calculadora();
		
	}

	@Test
	public void somaNumerosInteiros() {
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 3, 0);
		calculadora.Somar(7);
		assertEquals(calculadora.getResultado(), 10, 0);

	}
	
	@Test
	public void somaNumerosInteirosEVolta() {
		calculadora = new Calculadora(10);
		calculadora.Somarv(3);
		assertEquals(calculadora.getResultado(), 10, 0);
	}
	
	@Test
	public void somaNumeroscomVírgula() {
		calculadora.Somar(2.33);
		assertEquals(calculadora.getResultado(), 2.33, 0);
	}
	
	@Test
	public void somaValorEDivide() {
		calculadora.Somar(20);
		calculadora.Dividir(2);
		assertEquals(calculadora.getResultado(), 10, 0);
	}
	
	@Test
	public void somaValorEDivideEVolta() {
		calculadora.Somar(20);
		calculadora.Dividirv(2);
		assertEquals(calculadora.getResultado(), 20, 0);
	}
	
	@Test
	public void criaCalculadoraComValorSubtrai() {
		calculadora = new Calculadora(10);
		calculadora.Subtrair(5);
		assertEquals(calculadora.getResultado(), 5, 0);
	}
	
	@Test
	public void criaCalculadoraComValorSubtraiEVolta() {
		calculadora = new Calculadora(10);
		calculadora.Subtrairv(5);
		assertEquals(calculadora.getResultado(), 10, 0);

	}
	
	@Test
	public void criaCalculadoraComValorMultiplica() {
		calculadora = new Calculadora(10);
		calculadora.Multiplicar(5);
		assertEquals(calculadora.getResultado(), 50, 0);
	}
	
	@Test
	public void criaCalculadoraComValorMultiplicaEVoltar() {
		calculadora = new Calculadora(10);
		calculadora.Multiplicarv(5);
		assertEquals(calculadora.getResultado(), 10, 0);
	}
	
	@Test
	public void criaCalculadoraComValorInicial() {
		calculadora = new Calculadora(10);
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 13, 0);
	}
}


