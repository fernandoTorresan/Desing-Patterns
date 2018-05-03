package com.br.example.patterns.state.example1;

public class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean isDescontoExtraAplicado = false;

	public void aplicaDescontoExtra(OrcamentoState orcamento) {
		
		if (isDescontoExtraAplicado) {
			throw new RuntimeException("Desconto extra já foi aplicado, não pode ser aplicado novamente");
		}
		
		orcamento.valor -= orcamento.valor * 0.05;
		isDescontoExtraAplicado = true;
	}

	public void aprova(OrcamentoState orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	public void reprova(OrcamentoState orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	public void finaliza(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento em aprovação não pode ir para finalizado diretamente.");
	}
}
