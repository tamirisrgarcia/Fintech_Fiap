package br.com.fintech.fiap;

import java.util.Scanner;

public class Renda {
	
	private int id_renda;
	private String dsc_renda;
	private double valor;
	private String dt_recebimento;
	private String frequencia;
	static Renda renda;
	
	public Renda(int id_renda, String dsc_renda, double valor, String dt_recebimento, String frequencia) {
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

	public String getDt_recebimento() {
		return dt_recebimento;
	}

	public void setDt_recebimento(String dt_recebimento) {
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
	
	public void consultarRenda() {
		System.out.println("Renda: " + dsc_renda + " | com valor de: " + valor + " | Recebido na data: " + dt_recebimento);
	}
	
	public static void incluirRenda(int id_renda, String dsc_renda, double valor, String dt_recebimento, String frequencia) {
		renda = new Renda(id_renda, dsc_renda, valor, dt_recebimento, frequencia);
		System.out.println("Renda incluída com sucesso");
	}
	
	public void editarRenda() {
		System.out.print("1 - Editar descrição da renda:\n2 - Editar valor:\n3 - Editar data de recebimento:\n4 - É uma renda fixa?: ");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite a nova descrição da renda: ");
			String novaRenda = sc.next();
			dsc_renda = novaRenda;
			System.out.println("Sua nova renda é: " +dsc_renda);
		} else if(resposta == 2 ) {
			System.out.println("Digite valor: ");
			Double novoValor = sc.nextDouble();
			valor = novoValor;
			System.out.println("Seu novo valor é: " + valor);
		} else if(resposta == 3) {
			System.out.println("Digite a nova data de recebimento: ");
			String novaDtReceb = sc.next();
			dt_recebimento = novaDtReceb;
			System.out.println("Sua nova data é: " + dt_recebimento);
		} else if(resposta == 4) {
			System.out.println("Digite a recorrência da renda (Fixa ou Variável): ");
			String novaReco = sc.next();
			frequencia = novaReco;
			System.out.println("Sua recorrência é: " + frequencia);
		} else {
			System.out.println("Opção inválida");
		}
	}
	
	public static void excluirRenda() {
		renda = null;
		System.out.println("Renda excluída com sucesso");
	}
	
}
