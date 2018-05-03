package com.br.example.patterns.decorator.example2;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import com.br.example.patterns.templatemethod.example2.Conta;
import com.google.common.base.Predicate;

public class FiltroMaiorQue500MilReais extends Filtro {
	
	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroMaiorQue500MilReais() {
		
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		
		List<Conta> contasFiltradas = newArrayList(filter(contas, new Predicate<Conta>() {
			
			public boolean apply(Conta conta) {
				return conta.getSaldoConta() > 500000;
			}
		}));
		
		contasFiltradas.addAll(contasFiltradas);
		
		return contasFiltradas;
	}
}