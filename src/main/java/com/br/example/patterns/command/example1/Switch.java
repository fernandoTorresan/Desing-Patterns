package com.br.example.patterns.command.example1;

//invoker
public class Switch {
	
	public void storeAndExecute(Command command) {  
		command.execute();
	}
}
