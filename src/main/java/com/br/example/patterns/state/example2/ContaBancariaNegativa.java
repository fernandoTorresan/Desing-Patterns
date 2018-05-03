package com.br.example.patterns.state.example2;

public class ContaBancariaNegativa implements EstadoContaBancaria {

	public void efetuaSaque(ContaState conta, double valor) {
		throw new RuntimeException("Conta está negativa, não pode ser efetuado saque!");
	}

	public void efetuaDeposito(ContaState conta, double valor) {
		
		conta.saldo += valor * 0.95;
		
		if (conta.saldo > 0)
			conta.estado = new ContaBancariaPositiva();
	}
}
