package br.com.fintech.fiap;

import java.util.Date;
import java.util.Scanner;

public class Funcionario extends Pessoa {

	private int nr_registro;
	private String cargo;
	private String email_corp;
	static Funcionario funcionario;

	public Funcionario(int id_pessoa, String nome, String email_corp, String dt_nascimento, String foto_perfil) {
		super(id_pessoa, nome, dt_nascimento, foto_perfil);
	}

	public String getEmail_corp() {
		return email_corp;
	}

	public void setEmail_corp(String email_corp) {
		this.email_corp = email_corp;
	}

	public int getNr_registro() {
		return nr_registro;
	}

	public void setNr_registro(int nr_registro) {
		this.nr_registro = nr_registro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void consultarFuncionario(int nr_registro, String nome, String email_corp, Date dt_nascimento) {
		System.out.println("Nome:"  + nome + "| Data de Nascimento" + dt_nascimento + "| Email: " + email_corp + "| Regsitro: " + nr_registro );
	}
	
	public static void incluirFuncionario(int nr_registro, String cargo, String email_corp,String dt_nascimento ) {
		funcionario = new Funcionario(nr_registro, cargo, email_corp, dt_nascimento, email_corp);
		System.out.println("Usuario incluido com sucesso!");
	}
	
	public void editarFuncionario() {
		System.out.print("1 - Editar cargo:\n 2 - Editar email:\n - 3 Editar numero de registro:");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite o novo cargo: ");
			String novoCargo = sc.next();
			cargo = novoCargo;
			System.out.println("Seu novo cargo é: " + novoCargo);
		} else if(resposta == 2 ) {
			System.out.println("Digite o novo email corporativo: ");
			String novoEmail = sc.next();
			email_corp = novoEmail;
			System.out.println("Seu novo email é: " + novoEmail);
		} else if(resposta == 3) {
			System.out.println("Digite o novo numero de registro: ");
			int novoRegistro = sc.nextInt();
			nr_registro = novoRegistro;
			System.out.println("Seu novo numero de registro é: " + novoRegistro);
		}  else {
			System.out.println("Opção inválida");
		}
	}
	
	public static void excluirFuncionario() {
		funcionario = null;
		System.out.println("Funcionario excluido com sucesso!");
	}

}
