package com.br.example.patterns.state.example1;

public class Finalizado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra");
	}

	public void aprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento já está finalizado, não ir para aprovado");
		
	}

	public void reprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento já está finalizado, não pode ir para reprovado");
		
	}

	public void finaliza(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento já está finalizado, não pode ser finalizado novamente");
	}
}
