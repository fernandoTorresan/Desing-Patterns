package com.br.example.patterns.command.example1;

//concrete command
public class OnCommand implements Command {

	private Light light;

	public OnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
