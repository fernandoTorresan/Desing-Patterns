package com.br.example.patterns.templatemethod.example2;

public abstract class TemplateDeRelatorio {
	
	protected abstract void montaCabecalho(Conta conta);
	protected abstract void montaRodape(Conta conta);
}
