package br.com.fintech.fiap;

import java.util.Date;

public class Gastos {
	
	private int id_gasto;
	private String dsc_gastos;
	private double valor;
	private Date dt_gasto;
	private boolean gasto_fixo;
	
	public Gastos(int id_gasto, String dsc_gastos, double valor, Date dt_gasto, boolean gasto_fixo) {
		super();
		this.id_gasto = id_gasto;
		this.dsc_gastos = dsc_gastos;
		this.valor = valor;
		this.dt_gasto = dt_gasto;
		this.gasto_fixo = gasto_fixo;
	}

	public String getDsc_gastos() {
		return dsc_gastos;
	}

	public void setDsc_gastos(String dsc_gastos) {
		this.dsc_gastos = dsc_gastos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDt_gasto() {
		return dt_gasto;
	}

	public void setDt_gasto(Date dt_gasto) {
		this.dt_gasto = dt_gasto;
	}

	public boolean isGasto_fixo() {
		return gasto_fixo;
	}

	public void setGasto_fixo(boolean gasto_fixo) {
		this.gasto_fixo = gasto_fixo;
	}

	public int getId_gasto() {
		return id_gasto;
	}
	
	public double consultarGasto(int id_gasto) {
		return this.getValor();
	}
	
	private void incluirGasto() {
		
	}
	
	private void editarGasto(int id_gasto) {
		
	}
	
	private void excluirGasto(int id_gasto) {
		
	}
	
}
