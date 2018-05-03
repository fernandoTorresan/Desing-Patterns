package com.br.example.patterns.state.example2;

public class ContaBancariaPositiva implements EstadoContaBancaria {

	public void efetuaSaque(ContaState conta, double valor) {
		
		conta.saldo -= valor;
		
		if(conta.saldo < 0)
			conta.estado = new ContaBancariaNegativa();
	}

	public void efetuaDeposito(ContaState conta, double valor) {
		conta.saldo += valor * 0.98;
	}
}