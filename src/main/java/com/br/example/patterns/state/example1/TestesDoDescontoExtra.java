package com.br.example.patterns.state.example1;

public class TestesDoDescontoExtra {
	
	public static void main(String[] args) {
		
		OrcamentoState reforma = new OrcamentoState(500.0);
		
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
	}
}
