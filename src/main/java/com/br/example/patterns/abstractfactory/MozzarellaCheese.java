package com.br.example.patterns.abstractfactory;

public class MozzarellaCheese implements Cheese {

	public MozzarellaCheese() {
		prepareCheese();
	}
	
	@Override
	public void prepareCheese() {
		System.out.println("Preparing mozzarella cheese...");
	}
}
