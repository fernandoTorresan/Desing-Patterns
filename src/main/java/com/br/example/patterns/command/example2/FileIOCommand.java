package com.br.example.patterns.command.example2;

import static java.lang.String.format;
import static java.lang.System.out;

public class FileIOCommand implements Command {
	
	private String texto;

	public FileIOCommand(String texto) {
		this.texto = texto;
	}
	
	public void execute() {
		out.println(format("Manipulando o texto: %s", texto));
	}
}
