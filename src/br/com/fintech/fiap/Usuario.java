package br.com.fintech.fiap;
import java.util.Date;

import br.com.fintech.fiap.Pessoa;

public class Usuario extends Pessoa {
	
	private int senha;
	private String cpf;
	private String rg;

	public Usuario(int id_pessoa, String nome, String email, Date dt_nascimento, String foto_perfil) {
		super(id_pessoa, nome, email, dt_nascimento, foto_perfil);
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	private void incluirUsuario() {
		
	}
	
	public void consultarUsuario(int id_usuario) {
		
	}
	
	private void editarUsuario(int id_usuario) {
		
	}
	
	public void bloquearUsuario(int id_usuario) {
		
	}
	
	public void desbloquearUsuario(int id_usuario) {
		
	}
	
	public void excluirUsuario(int id_usuario) {
		
	}
	
}
