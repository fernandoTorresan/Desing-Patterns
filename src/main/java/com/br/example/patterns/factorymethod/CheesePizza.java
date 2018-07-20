package com.br.example.patterns.factorymethod;

public class CheesePizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients fro cheese pizza.");
	}
}
