package com.br.example.patterns.templatemethod.example1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IHITTest {

	@Test
	public void possuiItensComMesmaDescricaoTest() {

		Orcamento orcamento = new Orcamento(500);

		orcamento.adicionaItem(new Item("Caneta", 15.0));
		orcamento.adicionaItem(new Item("Caneta", 15.0));

		IHIT impostoIHIT = new IHIT();

		assertTrue(impostoIHIT.possuiItensComDescricoesIguais(orcamento));
	}
}
