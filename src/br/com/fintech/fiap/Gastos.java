package br.com.fintech.fiap;

import java.util.Scanner;

public class Gastos {
	
	private int id_gasto;
	private String dsc_gastos;
	private double valor;
	private String dt_gasto;
	private boolean gasto_fixo;
	static Gastos gasto;
	
	public Gastos(int id_gasto, String dsc_gastos, double valor, String dt_gasto, boolean gasto_fixo) {
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

	public String getDt_gasto() {
		return dt_gasto;
	}

	public void setDt_gasto(String dt_gasto) {
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
	
	public double consultarGasto() {
		return this.getValor();
	}
	
	public static void incluirGasto(int id_gasto, String dsc_gastos, double valor, String dt_gasto, boolean gasto_fixo) {
		gasto = new Gastos(id_gasto, dsc_gastos, valor, dt_gasto, gasto_fixo);
		System.out.println("Gasto incluído com sucesso");
	}
	
	public void editarGasto() {
		System.out.print("1 - Editar descrição do gasto:\n2 - Editar valor:\n3 - Editar data do gasto:\n4 - É um gasto fixo?: ");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite a nova descrição do gasto: ");
			String novoGasto = sc.next();
			dsc_gastos = novoGasto;
			System.out.println("Seu novo gasto é: " + dsc_gastos);
		} else if(resposta == 2 ) {
			System.out.println("Digite valor: ");
			int novoValor = sc.nextInt();
			valor = novoValor;
			System.out.println("Seu novo valor é: " + valor);
		} else if(resposta == 3) {
			System.out.println("Digite a nova data do gasto: ");
			String novaDtGasto = sc.next();
			dt_gasto = novaDtGasto;
			System.out.println("Sua nova data é: " + dt_gasto);
		} else if(resposta == 4) {
			System.out.println("Digite a recorrência do gasto (Fixo ou Variável): ");
			Boolean novaReco = sc.nextBoolean();
			gasto_fixo = novaReco;
			System.out.println("Sua recorrência é: " + gasto_fixo);
		} else {
			System.out.println("Opção inválida");
		}
	}
	
	public static void excluirGasto() {
		gasto = null;
		System.out.println("Gasto excluído com sucesso");
	}
	
}
