package com.br.example.patterns.decorator.example1;

import com.br.example.patterns.templatemethod.example1.Orcamento;

public abstract class Imposto {
	
	private final Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {
		this.outroImposto = null;
	}
	
	protected double calculaDoOutroImposto(Orcamento orcamento) {
		
		return (outroImposto == null ? 0 : outroImposto.calcula(orcamento));
	}
	
	public abstract double calcula(Orcamento orcamento);
}
