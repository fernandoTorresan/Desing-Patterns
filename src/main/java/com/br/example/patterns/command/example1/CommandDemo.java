package com.br.example.patterns.command.example1;

import java.util.ArrayList;
import java.util.List;

//Client
public class CommandDemo {
	
	public static void main(String[] args) {
		
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch();
		
		Command toggleCommand = new ToggleCommand(bedroomLight);
		
		lightSwitch.storeAndExecute(toggleCommand);
//		lightSwitch.storeAndExecute(toggleCommand);
//		lightSwitch.storeAndExecute(toggleCommand);
		
		List<Light> lights = new ArrayList<Light>();
		
		lights.add(bedroomLight);
		lights.add(kitchenLight);
		
		Command allLightsCommand = new AllLightsCommand(lights);
		
		lightSwitch.storeAndExecute(allLightsCommand);
		
	}
}
