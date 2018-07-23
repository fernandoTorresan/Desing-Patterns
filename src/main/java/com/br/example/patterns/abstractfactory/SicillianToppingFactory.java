package com.br.example.patterns.abstractfactory;

public class SicillianToppingFactory extends BaseToppingFactory {

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}
}
