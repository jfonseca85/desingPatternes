package br.com.alura.strategy.investimento;

public class Conta {
	private double saldo;

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}
}
