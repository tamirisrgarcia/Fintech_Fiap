package br.com.fintech.fiap;

import java.util.Scanner;

public class Endereco {

	private int id_endereco;
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int nr_casa;
	static Endereco endereco;
	
	public Endereco(int id_endereco, String pais, String estado, String cidade, String bairro, String rua,int nr_casa) {
		super();
		this.id_endereco = id_endereco;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.nr_casa = nr_casa;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNr_casa() {
		return nr_casa;
	}
	public void setNr_casa(int nr_casa) {
		this.nr_casa = nr_casa;
	}
	public int getId_endereco() {
		return id_endereco;
	}


	public static void incluirEndereco(int id_endereco, String pais, String estado, String cidade, String bairro, String rua,int nr_casa) {
		endereco = new Endereco(id_endereco, pais, estado, cidade, bairro, rua, nr_casa);
		System.out.println("Endereço adicionado com sucesso!");
	}

	public void consultarEndereco() {
		System.out.println("País: " + pais + " \nEstado: " + estado + "\nCidade: " + cidade + "\nBairro: " + bairro + "\nRua: " + rua + "\nNumero: " + nr_casa);
	}
	
	public void editarEndereco() {
		System.out.print("1 - Editar País:\n2 - Editar Estado:\n3 - Editar Cidade:\n4 - Editar Bairro:\n5 - Editar Rua;\n6 - Editar número:");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println("Digite o novo país: ");
			String novoPais = sc.next();
			pais = novoPais;
			System.out.println("Seu novo país é: " + pais);
		} 
		else if(resposta == 2 ) {
			System.out.println("Digite o novo estado: ");
			String novoEstado = sc.next();
			estado = novoEstado;
			System.out.println("Seu novo estado é: " + estado);
		} 
		else if(resposta == 3) {
			System.out.println("Digite a nova cidade: ");
			String novaCidade = sc.next();
			cidade = novaCidade;
			System.out.println("Sua nova cidade é: " + cidade);
		} 
		else if(resposta == 4) {
			System.out.println("Digite o novo bairro: ");
			String novoBairro = sc.next();
			bairro = novoBairro;
			System.out.println("Seu novo bairro é: " + bairro);
		}
		else if(resposta == 5) {
			System.out.println("Digite a nova rua: ");
			String novaRua = sc.next();
			rua = novaRua;
			System.out.println("Sua nova rua é: " + rua);
		}
		else if(resposta == 6) {
			System.out.println("Digite o novo número : ");
			int novoNr = sc.nextInt();
			nr_casa = novoNr;
			System.out.println("Seu novo número é: " + nr_casa);
		}
	
		else {
			System.out.println("Opção inválida");
		}
	}
	
	public static void excluirEndereco() {
		endereco = null;
		System.out.println("Endereço excluido com sucesso!");
	}
	
}
