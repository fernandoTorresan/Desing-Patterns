package com.br.example.patterns.state.example2;

public class ContaState {
	
	protected double saldo;
	protected EstadoContaBancaria estado;
	
	public ContaState() {
		saldo = 0;
		this.estado = new ContaBancariaPositiva();
	}
	
	public void saca(double valor) {
		estado.efetuaSaque(this, valor);
	}
	
	public void deposita(double valor) {
		estado.efetuaDeposito(this, valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
