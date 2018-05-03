package com.br.example.patterns.templatemethod.example2;

public class RelatorioSimples extends TemplateDeRelatorio {

	@Override
	protected void montaCabecalho(Conta conta) {
		
		System.out.println("Nome titular: " + conta.getNomeTitular() + " "
						 + "Saldo da conta: " + conta.getSaldoConta());
	}

	@Override
	protected void montaRodape(Conta conta) {
		
		System.out.println("Nome titular: " + conta.getNomeTitular() + " "
				 + "Saldo da conta: " + conta.getSaldoConta());
	}
}
