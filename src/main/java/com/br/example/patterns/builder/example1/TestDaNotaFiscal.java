package com.br.example.patterns.builder.example1;

public class TestDaNotaFiscal {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		NotaFiscal notaFiscal = builder.setRazaoSocial("Razão social testes")
									   .setCnpj("123")
									   .setItem(new ItemDaNota("Item 01", 200.0))
									   .setItem(new ItemDaNota("Item 02", 350))
									   .setObservacoes("Observação exemplo")
									   .build();
		
	}
}
