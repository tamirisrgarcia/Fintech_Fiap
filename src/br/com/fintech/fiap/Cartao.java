package br.com.fintech.fiap;

import java.util.Date;
import java.util.Scanner;

public class Cartao {

	public int id_cartao;
	private int nr_cartao;
	private String validade;
	private double limite;
	private String titular;
	private String bandeira;
	private int nr_seguranca;
	private String tipo;
	static Cartao cartao;
	
	public Cartao(int id_cartao, int nr_cartao, String validade, double limite, String titular, String bandeira, int nr_seguranca, String tipo) {
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

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
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
	

	public static void incluirCartao(int id_cartao, int nr_cartao, String validade, double limite, String titular, String bandeira, int nr_seguranca, String tipo) {
		cartao = new Cartao(id_cartao, nr_cartao, validade, limite, titular, bandeira, nr_seguranca, tipo);
		System.out.println("Cartão adicionado com sucesso !");
	}
	
	public void consultarCartao() {
		System.out.println("Numero do cartão: " + nr_cartao + " \nValidade: " + validade + "\nLimite: " + limite + "\nTitular: " + titular + "\nBandeira: " + bandeira + "\nNumero de segurança: " + nr_seguranca + "\nTipo: " + tipo);
	}
	
	public void editarCartao() {
		System.out.print("1 - Editar número do cartão:\n2 - Editar validade:\n3 - Editar titular:\n4 - Editar Limite:\n5 - Editar Bandeira;\n6 - Editar número de segurança:\n7 - Editar tipo:");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite o novo número do cartão: ");
			int novoNumero = sc.nextInt();
			nr_cartao = novoNumero;
			System.out.println("Seu novo número do cartão é: " + nr_cartao);
		} 
		else if(resposta == 2 ) {
			System.out.println("Digite a nova data de validade: ");
			String novaValidade = sc.next();
			validade = novaValidade;
			System.out.println("Sua nova validade é: " + validade);
		} 
		else if(resposta == 3) {
			System.out.println("Digite o(a) novo(a) titular: ");
			String novoTitular = sc.next();
			titular = novoTitular;
			System.out.println("Seu novo tipo de conta é: " + titular);
		} 
		else if(resposta == 4) {
			System.out.println("Digite o novo limite: ");
			double novoLimite = sc.nextDouble();
			limite = novoLimite;
			System.out.println("Seu novo limite é: " + limite);
		}
		else if(resposta == 5) {
			System.out.println("Digite a nova bandeira: ");
			String novaBandeira = sc.next();
			bandeira = novaBandeira;
			System.out.println("Sua nova bandeira é: " + bandeira);
		}
		else if(resposta == 6) {
			System.out.println("Digite o novo número de segurança: ");
			int novoNrSeguranca = sc.nextInt();
			nr_seguranca = novoNrSeguranca;
			System.out.println("Seu novo tipo de conta é: " + nr_seguranca);
		}
		else if(resposta == 7) {
			System.out.println("Digite o novo tipo do cartão: ");
			String novoTipo = sc.next();
			tipo = novoTipo;
			System.out.println("Seu novo tipo de cartão é: " + tipo);
		}
		else {
			System.out.println("Opção inválida");
		}
		
	}
	
	public void bloquearCartao(int id_cartao) {
		
	}
	
	public void desbloquearCartao(int id_cartao) {
		
	}
	
	public static void excluirCartao(int id_cartao) {
		cartao = null;
		System.out.println("Cartão excluido com sucesso!");
	}
	
}
