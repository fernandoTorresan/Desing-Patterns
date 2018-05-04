package com.br.example.patterns.observer.example1;

public class EnviadorDeSMS implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando a nota fiscal por sms");
	}
}
