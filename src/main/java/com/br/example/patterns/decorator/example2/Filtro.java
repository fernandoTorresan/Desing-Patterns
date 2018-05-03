package com.br.example.patterns.decorator.example2;

import java.util.Collections;
import java.util.List;

import com.br.example.patterns.templatemethod.example2.Conta;

public abstract class Filtro {
	
	protected Filtro outroFiltro;

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro() {
		
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> proximo(List<Conta> contas) {
		
		if(outroFiltro != null)
			return outroFiltro.filtra(contas);
		else
			return Collections.emptyList();
	}
}
