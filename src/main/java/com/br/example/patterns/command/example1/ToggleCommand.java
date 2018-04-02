package com.br.example.patterns.command.example1;

public class ToggleCommand implements Command {
	
	private Light light;

	public ToggleCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.toggle();
	}

}
