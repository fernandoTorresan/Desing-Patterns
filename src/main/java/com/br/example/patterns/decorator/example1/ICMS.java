package com.br.example.patterns.decorator.example1;

import com.br.example.patterns.templatemethod.example1.Orcamento;

public class ICMS extends Imposto {
	
	public ICMS(Imposto imposto) {
		super(imposto);
	}
	
	public ICMS() {
		super();
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 + calculaDoOutroImposto(orcamento);
	}
}
