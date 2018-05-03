package com.br.example.patterns.decorator.example2;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.Calendar;
import java.util.List;

import com.br.example.patterns.templatemethod.example2.Conta;
import com.google.common.base.Predicate;

public class FiltroMesmoMes extends Filtro {
	
	public FiltroMesmoMes(Filtro outroFitro) {
		super(outroFitro);
	}
	
	public FiltroMesmoMes() {
		
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		
		List<Conta> contasFiltradas = newArrayList(filter(contas, new Predicate<Conta>() {
			
			public boolean apply(Conta conta) {
				return isContaAbertaNoMesmoMes(conta);
			}

			private boolean isContaAbertaNoMesmoMes(Conta conta) {
				return conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) && 
			           conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR);
			}
		}));
		
		contasFiltradas.addAll(outroFiltro.proximo(contas));
		
		return contasFiltradas;
	}
}