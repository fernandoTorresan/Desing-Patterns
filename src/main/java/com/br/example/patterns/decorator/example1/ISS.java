package com.br.example.patterns.decorator.example1;

import com.br.example.patterns.templatemethod.example1.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaDoOutroImposto(orcamento);
	}
}