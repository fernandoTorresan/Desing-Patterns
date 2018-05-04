package com.br.example.patterns.observer.example1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private List<ItemDaNota> itens;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
	
	public NotaFiscalBuilder() {
		dataDeEmissao = Calendar.getInstance();
		todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
		itens = new ArrayList<ItemDaNota>();
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		todasAcoesASeremExecutadas.add(acao);
	}

	public NotaFiscalBuilder setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder setItem(ItemDaNota item) {
		itens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.5;
		return this;
	}

	public NotaFiscalBuilder setObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder setData(Calendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
		return this;
	}

	public NotaFiscal build() {
		
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, impostos, itens, observacoes);
		
		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(notaFiscal);
		}
		
		return notaFiscal;
	}
}
