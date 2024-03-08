package br.com.fintech.fiap;
import java.util.Scanner;

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
	
	public void consultarSaldo() {
		 System.out.println("Seu saldo é: " + this.saldo);
	}
	
	private double depositar(double valor) {
		this.saldo = this.getSaldo() + valor;
		return this.saldo;
	}
	
	private double sacar(double valor) {
		this.saldo = this.getSaldo() - valor;
		return this.saldo;
	}
	
	public void incluirConta(int id_conta, int nr_conta, int agencia, double saldo, String tipo) {
		Conta conta = new Conta(id_conta, nr_conta, agencia, saldo, tipo);
		System.out.println("Sua conta foi criada com sucesso!\n Sua agencia é: " + agencia + "\nSeu número da conta é: " + nr_conta + "\nSeu tipo de conta é: " + tipo);
	}
	
	public void editarConta() { 
		System.out.print("1 - Editar número da conta:\n2 - Editar número da agência:\n3 - Editar tipo da conta: ");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite o novo número da conta: ");
			int novoNumero = sc.nextInt();
			System.out.println("Seu novo número da conta é: " + novoNumero);
		} else if(resposta == 2 ) {
			System.out.println("Digite o novo número da agência: ");
			int novaAgencia = sc.nextInt();
			System.out.println("Sua nova agencia é: " + novaAgencia);
		} else if(resposta == 3) {
			System.out.println("Digite o novo tipo da conta: ");
			String novoTipoConta = sc.next();
			System.out.println("Seu novo tipo de conta é: " + novoTipoConta);
		} else {
			System.out.println("Opção inválida");
		}
		
	}
	
	private void excluirConta(int id_conta) {
		
		System.out.println("Sua conta foi excluída com sucesso");
	}
	
	
}
