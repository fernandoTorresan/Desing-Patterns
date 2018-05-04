package com.br.example.patterns.observer.example1;

public class NotaFiscalDAO implements AcaoAposGerarNota {

	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando a nota fiscal no banco");
	}
}
