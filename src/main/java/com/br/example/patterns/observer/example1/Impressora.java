package com.br.example.patterns.observer.example1;

public class Impressora implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo a nota fiscal por e-mail");
	}
}
