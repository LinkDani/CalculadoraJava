package br.com.empresa.banco;

public class Conta {
	private String agencia;
	private String conta;
	private String titular;
	
	public Conta(String titular, String agencia, String conta) {
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public String GetTitular() {
		return this.titular;
	}
	
	public double GetSaldo() {
		return 0;
	}
}

