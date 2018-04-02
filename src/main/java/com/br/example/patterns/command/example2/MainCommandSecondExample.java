package com.br.example.patterns.command.example2;

import java.util.ArrayList;
import java.util.List;

public class MainCommandSecondExample {
	
	public static void main(String[] args) {
		List<Command> comandos = new ArrayList<Command>();
		String texto = "Segundo exemplo utilizando desing patter command!";
		comandos.add(new EmailCommand("remetente@gmail.com", "destinatario@gmail.com", "Command pattern", texto));
		comandos.add(new FileIOCommand(texto));
		comandos.add(new LogCommand());
		comandos.add(new SmsCommand("44 4323-8754"));
		
		for (Command comando : comandos) {
			comando.execute();
		}
	}
}
