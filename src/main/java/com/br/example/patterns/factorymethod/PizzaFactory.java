package com.br.example.patterns.factorymethod;

public class PizzaFactory implements BasePizzaFactory {

	public Pizza createPizza(String type) {
		
		Pizza pizza;
		
		switch (type.toLowerCase()) {
		
			case "cheese":
				pizza = new CheesePizza();
				break;
				
			case "pepperoni":
				pizza = new PepperoniPizza();
				break;
				
			case "veggie":
				pizza = new VeggiePizza();
				break;

		default:
			throw new IllegalArgumentException("No such pizza.");
		}
		
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}
}
