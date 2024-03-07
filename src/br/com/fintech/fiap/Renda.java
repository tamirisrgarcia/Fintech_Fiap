package br.com.fintech.fiap;

import java.util.Date;

public class Renda {
	
	private int id_renda;
	private String dsc_renda;
	private double valor;
	private Date dt_recebimento;
	private String frequencia;
	
	public Renda(int id_renda, String dsc_renda, double valor, Date dt_recebimento, String frequencia) {
		super();
		this.id_renda = id_renda;
		this.dsc_renda = dsc_renda;
		this.valor = valor;
		this.dt_recebimento = dt_recebimento;
		this.frequencia = frequencia;
	}

	public String getDsc_renda() {
		return dsc_renda;
	}

	public void setDsc_renda(String dsc_renda) {
		this.dsc_renda = dsc_renda;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDt_recebimento() {
		return dt_recebimento;
	}

	public void setDt_recebimento(Date dt_recebimento) {
		this.dt_recebimento = dt_recebimento;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}

	public int getId_renda() {
		return id_renda;
	}
	
	public void consultarRenda(int id_renda) {
		
	}
	
	private void incluirRenda() {
		
	}
	
	private void editarRenda(int id_renda) {
		
	}
	
	private void excluirRenda(int id_renda) {
		
	}
	
}
