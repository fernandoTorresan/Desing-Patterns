package com.br.example.patterns.state.example2;

public interface EstadoContaBancaria {
	
	void efetuaSaque(ContaState conta, double valor);
	void efetuaDeposito(ContaState conta, double valor);
}
