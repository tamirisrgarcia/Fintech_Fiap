package br.com.fintech.fiap;

public class Conta {
	public int id_conta;
	private int nr_conta;
	private int agencia;
	private double saldo;
	private String tipo;
	
	public Conta(int id_conta, int nr_conta, int agencia, double saldo, String tipo) {
		super();
		this.id_conta = id_conta;
		this.nr_conta = nr_conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	public int getNr_conta() {
		return nr_conta;
	}

	public void setNr_conta(int nr_conta) {
		this.nr_conta = nr_conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId_conta() {
		return id_conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void consultarSaldo(int nr_conta) {
		
	}
	
	private void depositar(double valor) {
		this.saldo = this.getSaldo() + valor;
		
	}
	
	private void sacar(double valor) {
		this.saldo = this.getSaldo() - valor;
		
	}
	
	public void incluirConta() {
		
	}
	
	private void editarConta(int id_conta) {
		
	}
	
	private void excluirConta(int id_conta) {
		
	}
	
	
}
