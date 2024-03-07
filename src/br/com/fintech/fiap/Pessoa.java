package br.com.fintech.fiap;

import java.util.Date;

public class Pessoa {

	private int id_pessoa;
	private String nome;
	private String email;
	private Date dt_nascimento;
	private String foto_perfil;
	
	public Pessoa(int id_pessoa, String nome, String email, Date dt_nascimento, String foto_perfil) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome = nome;
		this.email = email;
		this.dt_nascimento = dt_nascimento;
		this.foto_perfil = foto_perfil;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getFoto_perfil() {
		return foto_perfil;
	}
	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}
	public int getId_pessoa() {
		return id_pessoa;
	}
	
	
	
}
