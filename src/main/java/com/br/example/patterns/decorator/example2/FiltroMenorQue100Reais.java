package com.br.example.patterns.decorator.example2;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import com.br.example.patterns.templatemethod.example2.Conta;
import com.google.common.base.Predicate;

public class FiltroMenorQue100Reais extends Filtro {

	public FiltroMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMenorQue100Reais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {

		List<Conta> contasFiltradas = newArrayList(filter(contas, new Predicate<Conta>() {
			
			public boolean apply(Conta conta) {
				return conta.getSaldoConta() < 100;
			}
		}));
		
		contasFiltradas.addAll(proximo(contas));
		return contasFiltradas;
	}
}
