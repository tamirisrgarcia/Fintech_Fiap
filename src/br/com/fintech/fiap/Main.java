package br.com.fintech.fiap;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		//Usuario user = new Usuario(123, "Teste", "email@email.com", new Date(1995-12-24), "foto.png");
		Conta conta = new Conta(123, 321, 456, 58.8, "Poupança");
		
		//conta.editarConta();
		
		conta.incluirConta(123, 321, 456, 789.2, "oi");
		
	}
}
