package com.br.example.patterns.decorator.example1;

import com.br.example.patterns.templatemethod.example1.Orcamento;

public class ImpostoMuitoAlto extends Imposto {
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ImpostoMuitoAlto() {
		super();
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculaDoOutroImposto(orcamento);
	}
}
