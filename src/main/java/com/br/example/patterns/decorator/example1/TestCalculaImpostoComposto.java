package com.br.example.patterns.decorator.example1;

import com.br.example.patterns.templatemethod.example1.Orcamento;

public class TestCalculaImpostoComposto {
	
	public static void main(String[] args) {
		
		Imposto imposto = new ISS(new ICMS());
		
		Imposto impostoIssMuitoAlto = new ImpostoMuitoAlto(new ISS());
		
		Orcamento orcamento = new Orcamento(500.0);
		
		System.out.println(imposto.calcula(orcamento));
		System.out.println(impostoIssMuitoAlto.calcula(orcamento));
		
	}
}
