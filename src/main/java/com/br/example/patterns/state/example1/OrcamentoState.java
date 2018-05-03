package com.br.example.patterns.state.example1;

public class OrcamentoState {

	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual;

	public OrcamentoState(double valor) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
