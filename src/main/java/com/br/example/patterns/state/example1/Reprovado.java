package com.br.example.patterns.state.example1;

public class Reprovado implements EstadoDeUmOrcamento{

	public void aplicaDescontoExtra(OrcamentoState orcamento) {
		new RuntimeException("Orçamentos reprovados não podem receber descontos extras!");
	}

	public void aprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento já está reprovado");
	}

	public void reprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento já está finalizado");
		
	}

	public void finaliza(OrcamentoState orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
