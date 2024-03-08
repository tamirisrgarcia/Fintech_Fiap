package br.com.fintech.fiap;
import java.util.Date;
import java.util.Scanner;

import br.com.fintech.fiap.Pessoa;

public class Usuario extends Pessoa {
	
	private String email;
	private int senha;

	public Usuario(int id_pessoa, String nome, Date dt_nascimento, String foto_perfil, String email, int senha) {
		super(id_pessoa, nome, dt_nascimento, foto_perfil);
		this.email = email;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	
	private void incluirUsuario(int id_pessoa, String nome, Date dt_nascimento, String foto_perfil, String email, int senha) {
		Usuario usuario = new Usuario(id_pessoa, nome, dt_nascimento, foto_perfil, email, senha);
		System.out.println("Usuário incluído com sucesso!");
	}
	
	public void consultarUsuario(int id_usuario, String nome, Date dt_nascimento, String email) {
		System.out.println("Nome: " + nome + "Data de Nascimento" + dt_nascimento + "Email: " + email);
	}
	
	private void editarUsuario() {
		System.out.print("1 - Editar nome do usuário:\n2 - Editar email do usuário:\n3 - Editar data de nascimento do usuário:\n4 - Editar senha: ");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite o novo nome do usuário: ");
			int novoNome = sc.nextInt();
			System.out.println("Seu novo nome do usuário é: " + novoNome);
		} else if(resposta == 2 ) {
			System.out.println("Digite o novo email do usuário: ");
			int novoEmail = sc.nextInt();
			System.out.println("Seu novo email é: " + novoEmail);
		} else if(resposta == 3) {
			System.out.println("Digite a nova data de nascimento: ");
			String novaDtNasc = sc.next();
			System.out.println("Sua nova data de nascimento é: " + novaDtNasc);
		} else if(resposta == 4) {
			System.out.println("Digite a nova senha: ");
			String novaSenha = sc.next();
			System.out.println("Sua nova senha: " + novaSenha);
		} else {
			System.out.println("Opção inválida");
		}
	}
	
	public void bloquearUsuario(int id_usuario) {
		System.out.println("Usuário bloqueado com sucesso");
	}
	
	public void desbloquearUsuario(int id_usuario) {
		System.out.println("Usuário desbloqueado com sucesso");
	}
	
	public void excluirUsuario(int id_usuario) {
		System.out.println("Usuário excluído com sucesso");
	}
	
}
