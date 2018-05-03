package com.br.example.patterns.state.example1;

public interface EstadoDeUmOrcamento {
	
	void aplicaDescontoExtra(OrcamentoState orcamento);
	void aprova(OrcamentoState orcamento);
	void reprova(OrcamentoState orcamento);
	void finaliza(OrcamentoState orcamento);
}
