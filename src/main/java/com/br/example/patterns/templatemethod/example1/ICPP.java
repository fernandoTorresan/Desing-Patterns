package com.br.example.patterns.templatemethod.example1;

import com.br.example.patterns.decorator.example1.Imposto;

public class ICPP extends TemplateDeImpostoCondicional {
	
	public ICPP() {
		
	}
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}
}
