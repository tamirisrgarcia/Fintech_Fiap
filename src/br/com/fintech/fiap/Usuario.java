package br.com.fintech.fiap;
import java.util.Date;
import java.util.Scanner;

import br.com.fintech.fiap.Pessoa;

public class Usuario extends Pessoa {
	
	private String email;
	private int senha;
	static Usuario usuario;

	public Usuario(int id_pessoa, String nome, String dt_nascimento, double cpf, double rg ,String foto_perfil, String email, int senha) {
		super(id_pessoa, nome, cpf, rg, dt_nascimento, foto_perfil);
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

	
	public static void incluirUsuario(int id_pessoa, String nome, String dt_nascimento, double cpf, double rg , String foto_perfil, String email, int senha) {
		usuario = new Usuario(id_pessoa, nome, dt_nascimento, cpf, rg, foto_perfil, email, senha);
		System.out.println("Usuário incluído com sucesso!");
	}
	
	public void consultarUsuario(int id_usuario, String nome, Date dt_nascimento, String email) {
		System.out.println("Nome: " + nome + "Data de Nascimento" + dt_nascimento + "Email: " + email);
	}
	
	public void editarUsuario() {
		System.out.print("1 - Editar email do usuário:\n 2- Editar senha: ");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite o novo nome email: ");
			String novoEmail = sc.next();
			email = novoEmail;
			System.out.println("Seu novo email é: " + email);
		} else if(resposta == 2 ) {
			System.out.println("Digite a nova senha: ");
			int novaSenha = sc.nextInt();
			senha = novaSenha;
			System.out.println("Sua nova senha é: " + senha);
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
	
	public static void excluirUsuario() {
		usuario = null;
		System.out.println("Usuário excluído com sucesso");
	}
	
}
