package com.br.example.patterns.observer.example1;

import java.util.Calendar;

public class TesteAcao {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new EnviadorDeSMS());
		builder.adicionaAcao(new Impressora());
		
		NotaFiscal notaFiscal = builder.setRazaoSocial("XPTO")
									   .setCnpj("123")
									   .setItem(new ItemDaNota("item 1", 200))
									   .setItem(new ItemDaNota("item 2", 100))
									   .setObservacoes("obs")
									   .setData(Calendar.getInstance())
									   .build();
									
		System.out.println(notaFiscal.getValorBruto());
		
				
	}

}
