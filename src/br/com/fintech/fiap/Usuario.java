package br.com.fintech.fiap;

import java.util.Scanner;

public class Usuario extends Pessoa {
	
	private String email;
	private int senha;
	private Boolean bloqueado = false;
	static Usuario usuario;

	public Usuario(int id_pessoa, String nome, String dt_nascimento, double cpf, double rg ,String foto_perfil, String email, int senha, Boolean bloqueado) {
		super(id_pessoa, nome, cpf, rg, dt_nascimento, foto_perfil);
		this.email = email;
		this.senha = senha;
		this.bloqueado = bloqueado;
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

	public boolean getBloqueado(){
		return bloqueado;
	}

	public void setBloqueado(Boolean bloqueado){
		this.bloqueado = bloqueado;
	}
	
	public static void incluirUsuario(int id_pessoa, String nome, String dt_nascimento, double cpf, double rg , String foto_perfil, String email, int senha, Boolean bloqueado) {
		usuario = new Usuario(id_pessoa, nome, dt_nascimento, cpf, rg, foto_perfil, email, senha, bloqueado);
		System.out.println("Usuário incluído com sucesso!");
	}
	
	public String consultarUsuario() {
		String txtuser = "Nome: " + this.nome + " Data de Nascimento: " + this.dt_nascimento + " Email: " + email + " Status da conta: " + bloqueado;
		return txtuser;
	}
	
	public void editarUsuario() {
		System.out.print("1 - Editar email do usuário:\n 2- Editar senha:\n3 - Bloquear usuario:\n4 - Desbloquear usuario:");
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
		} else if(resposta == 3){
			bloquearUsuario();
		} else if(resposta == 4){
			desbloquearUsuario();
		}
		else {
			System.out.println("Opção inválida");
		}
	}
	
	public void bloquearUsuario() {
		bloqueado = true;
		System.out.println("Usuário bloqueado com sucesso");
	}
	
	public void desbloquearUsuario() {
		bloqueado = false;
		System.out.println("Usuário desbloqueado com sucesso");
	}
	
	public static void excluirUsuario() {
		usuario = null;
		System.out.println("Usuário excluído com sucesso");
	}
	
}
