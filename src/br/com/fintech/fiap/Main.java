package br.com.fintech.fiap;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		
		Conta.incluirConta(768, 1, 2, 3, "oi");
		System.out.println("ID da conta: " + Conta.conta.getAgencia());
		Conta.excluirConta();
		System.out.println("ID da conta: " + Conta.conta.getAgencia());
	}
}
