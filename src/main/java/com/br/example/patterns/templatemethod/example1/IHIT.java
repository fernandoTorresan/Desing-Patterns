package com.br.example.patterns.templatemethod.example1;

import static com.google.common.collect.Iterables.any;

import java.util.List;

import com.google.common.base.Predicate;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {

		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {

		return possuiItensComDescricoesIguais(orcamento);
	}

	public boolean possuiItensComDescricoesIguais(Orcamento orcamento) {

		List<Item> itens = orcamento.getItens();

		for (final Item item : itens) {

			boolean existeDuplicidade = any(itens, new Predicate<Item>() {

				public boolean apply(Item input) {
					return input.getDescricao().equals(item.getDescricao());
				}
			});
			
			if (existeDuplicidade)
				return true;
		}
		return false;
	}
}
