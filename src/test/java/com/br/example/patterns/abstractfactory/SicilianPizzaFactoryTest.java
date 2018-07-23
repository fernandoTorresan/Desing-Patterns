package com.br.example.patterns.abstractfactory;

import org.junit.Test;

public class SicilianPizzaFactoryTest {
	
	@Test
	public void createPizzaTest() {
		BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
	}
}
