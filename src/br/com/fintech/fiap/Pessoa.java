package br.com.fintech.fiap;

import java.util.Date;

public class Pessoa {

	private int id_pessoa;
	private String nome;
	private Date dt_nascimento;
	private String foto_perfil;
	private String cpf;
	private String rg;
	
	public Pessoa(int id_pessoa, String nome, Date dt_nascimento, String foto_perfil) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		this.foto_perfil = foto_perfil;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	
}
