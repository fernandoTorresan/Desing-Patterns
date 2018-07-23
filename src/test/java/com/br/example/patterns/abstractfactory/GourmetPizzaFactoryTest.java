package com.br.example.patterns.abstractfactory;

import org.junit.Test;

public class GourmetPizzaFactoryTest {
	
	@Test
	public void createPizzaTest() {
		BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
		Pizza cheesePizza = pizzaFactory.createPizza("cheese");
		Pizza veggiePizza = pizzaFactory.createPizza("veggie");
	}
}
