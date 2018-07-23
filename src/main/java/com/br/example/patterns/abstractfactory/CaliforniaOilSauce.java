package com.br.example.patterns.abstractfactory;

public class CaliforniaOilSauce implements Sauce {

	public CaliforniaOilSauce() {
		prepareSauce();
	}
	
	@Override
	public void prepareSauce() {
		System.out.println("Preparing california oil sauce...");
	}
}
