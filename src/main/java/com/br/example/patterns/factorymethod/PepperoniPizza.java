package com.br.example.patterns.factorymethod;

public class PepperoniPizza extends Pizza {

	@Override
	public void addIngredients() {
		System.out.println("Preparing ingredients for pepperoni pizza.");
	}

}
