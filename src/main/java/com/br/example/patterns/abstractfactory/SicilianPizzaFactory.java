package com.br.example.patterns.abstractfactory;

public class SicilianPizzaFactory extends BasePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		BaseToppingFactory toppingFactory = new SicillianToppingFactory();
		
		switch (type) {
		
			case "cheese":
				pizza = new CheesePizza(toppingFactory);
				break;
				
			case "pepperoni":
				pizza = new PepperoniPizza(toppingFactory);
				break;
			
			case "veggie":
				pizza = new VeggiePizza(toppingFactory);
				break;
				
			default:
				throw new IllegalArgumentException("No such pizza");
		}
		
		pizza.addIngredients();
		pizza.bakePizza();
		return pizza;
	}
}
