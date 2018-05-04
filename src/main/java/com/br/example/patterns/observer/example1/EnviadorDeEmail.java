package com.br.example.patterns.observer.example1;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando nota fiscal por e-mail");
	}
}
