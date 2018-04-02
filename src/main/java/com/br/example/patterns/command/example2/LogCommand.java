package com.br.example.patterns.command.example2;

public class LogCommand implements Command {
	
	public void execute() {
		
		System.out.println("Escrevendo no log...");
	}
}
