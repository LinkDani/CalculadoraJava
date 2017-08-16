package br.com.empresa.lib;

public class Calculadora {
	private double resultado;
	
	public Calculadora() {
	}
	
	public Calculadora(double valor) {
		this.resultado = valor; 
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public double Somar(double valor) {
		return this.resultado += valor;
	}
	
	public double Somarv(double valor) {
		this.resultado += valor;
		return this.resultado -= valor;
	}
	
	public double Subtrair(double valor) {
		return this.resultado -= valor;
		
	}
	
	public double Subtrairv(double valor) {
		 this.resultado -= valor;
		 return this.resultado += valor;
		
	}


	public double Dividir(double valor) {
		return this.resultado /= valor;
		
	}
	
	public double Dividirv(double valor) {
		this.resultado /= valor;
		return this.resultado *= valor;
		
	}
	
	
	public double Multiplicar(double valor) {
		return this.resultado *= valor;
		
	}
	
	public double Multiplicarv(double valor) {
		this.resultado *= valor;
		return this.resultado /= valor;
		
	}
	
}
