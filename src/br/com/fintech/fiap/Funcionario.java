package br.com.fintech.fiap;

import java.util.Date;

public class Funcionario extends Pessoa {

	private int nr_registro;
	private String cargo;
	private String email_corp;
	
	public Funcionario(int id_pessoa, String nome, String email_corp, Date dt_nascimento, String foto_perfil) {
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
	
	public void consultarFuncionario(int id_funcionario) {
		
	}
	
	public void incluirFuncionario() {
		
	}
	
	private void editarFuncionario(int id_funcionario) {
		
	}
	
	private void excluirFuncionario(int id_funcionario) {
		
	}

}
