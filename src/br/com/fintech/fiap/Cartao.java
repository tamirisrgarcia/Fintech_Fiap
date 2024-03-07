package br.com.fintech.fiap;

import java.util.Date;

public class Cartao {

	public int id_cartao;
	private int nr_cartao;
	private Date validade;
	private double limite;
	private String titular;
	private String bandeira;
	private int nr_seguranca;
	private String tipo;
	
	public Cartao(int id_cartao, int nr_cartao, Date validade, double limite, String titular, String bandeira,
			int nr_seguranca, String tipo) {
		super();
		this.id_cartao = id_cartao;
		this.nr_cartao = nr_cartao;
		this.validade = validade;
		this.limite = limite;
		this.titular = titular;
		this.bandeira = bandeira;
		this.nr_seguranca = nr_seguranca;
		this.tipo = tipo;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId_cartao() {
		return id_cartao;
	}
	
	public int getNr_cartao() {
		return nr_cartao;
	}
	
	public void setNr_cartao(int nr_cartao) {
		this.nr_cartao = nr_cartao;
	}

	public int getNr_seguranca() {
		return nr_seguranca;
	}
	
	public void setNr_seguranca(int nr_seguranca)
	{
		this.nr_seguranca = nr_seguranca;
	}
	
	private void incluirCartao() {
		
	}
	
	public void consultarCartao(int id_cartao) {
		
	}
	
	private void editarCartao(int id_cartao) {
		
	}
	
	public void bloquearCartao(int id_cartao) {
		
	}
	
	public void desbloquearCartao(int id_cartao) {
		
	}
	
	public void excluirCartao(int id_cartao) {
		
	}
	
}
