package br.com.fintech.fiap;

import java.util.Date;
import java.util.Scanner;

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
	
	private void incluirRenda(int id_renda, String dsc_renda, double valor, Date dt_recebimento, String frequencia) {
		Renda renda = new Renda(id_renda, dsc_renda, valor, dt_recebimento, frequencia);
		System.out.println("Renda incluída com sucesso");
	}
	
	private void editarRenda() {
		System.out.print("1 - Editar descrição da renda:\n2 - Editar valor:\n3 - Editar data de recebimento:\n4 - É uma renda fixa?: ");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite a nova descrição da renda: ");
			int novaRenda = sc.nextInt();
			System.out.println("Sua nova renda é: " + novaRenda);
		} else if(resposta == 2 ) {
			System.out.println("Digite valor: ");
			int novoValor = sc.nextInt();
			System.out.println("Seu novo valor é: " + novoValor);
		} else if(resposta == 3) {
			System.out.println("Digite a nova data de recebimento: ");
			String novaDtReceb = sc.next();
			System.out.println("Sua nova data é: " + novaDtReceb);
		} else if(resposta == 4) {
			System.out.println("Digite a recorrência da renda (Fixa ou Variável): ");
			String novaReco = sc.next();
			System.out.println("Sua recorrência é: " + novaReco);
		} else {
			System.out.println("Opção inválida");
		}
	}
	
	private void excluirRenda(int id_renda) {
		System.out.println("Renda excluída com sucesso");
	}
	
}
