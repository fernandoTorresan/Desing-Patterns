package com.br.example.patterns.state.example1;

public class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean isDescontoExtraAplicado = false;

	public void aplicaDescontoExtra(OrcamentoState orcamento) {
		
		if (isDescontoExtraAplicado) {
			throw new RuntimeException("Desconto extra já foi aplicado, não pode ser aplicado novamente");
		}
		
		orcamento.valor -= orcamento.valor * 0.02;
		isDescontoExtraAplicado = true;
	}

	public void aprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento já está em estado de aprovação");
	}

	public void reprova(OrcamentoState orcamento) {
		throw new RuntimeException("Orçamento já está em estado de aprovação não pode ser reprovado");
	}

	public void finaliza(OrcamentoState orcamento) {
		orcamento.estadoAtual =  new Finalizado();
	}
}
