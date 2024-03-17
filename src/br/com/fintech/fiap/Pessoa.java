package br.com.fintech.fiap;

import java.util.Scanner;

public class Pessoa {

	private int id_pessoa;
	protected String nome;
	protected String dt_nascimento;
	private String foto_perfil;
	private Double cpf;
	private Double rg;
	static Pessoa pessoa;
	
	public Pessoa(int id_pessoa, String nome, double cpf, double rg, String dt_nascimento, String foto_perfil) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		this.foto_perfil = foto_perfil;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getFoto_perfil() {
		return foto_perfil;
	}
	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}
	public int getId_pessoa() {
		return id_pessoa;
	}
	
	public Double getCpf() {
		return cpf;
	}
	
	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}

	public Double getRg() {
		return rg;
	}
	
	public void setRg(Double rg) {
		this.rg = rg;
	}

	public static void incluirPessoa(int id_pessoa, String nome, double cpf , double rg ,String dt_nascimento, String foto_perfil){
		pessoa = new Pessoa(id_pessoa, nome, cpf , rg , dt_nascimento, foto_perfil);
	}

	public void editarPessoa(){
		System.out.println("1 - Editar nome \n 2 - Editar data de nascimento \n 3 - trocar foto de perfil \n 4 - Editar CPF \n 5 - Editar RG");
		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();

		if(resposta == 1){
			System.out.println("Digite o novo nome: ");
			String novoNome = sc.next();
			nome = novoNome;
			System.out.println("Seu novo nome é: " + nome);
		} else if( resposta == 2){
			System.out.println("Digite a nova data de nascimento: ");
			String novaDtnascimento = sc.next();
			dt_nascimento = novaDtnascimento;
			System.out.println("Sua nova data de nascimento é: " + dt_nascimento);
		} else if(resposta == 3){
			System.out.println("Coloque sua nova foto: ");
			String novaFoto = sc.next();
			foto_perfil = novaFoto;
			System.out.println("Sua novo foto é: " + foto_perfil);
		} else if(resposta == 4){
			System.out.println("Digite o novo CPF: ");
			Double novoCPF = sc.nextDouble();
			cpf = novoCPF;
			System.out.println("Seu novo CPF é: " + cpf);
		} else if(resposta == 5){
			System.out.println("Digite o novo RG: ");
			Double novoRG = sc.nextDouble();
			rg = novoRG;
			System.out.println("Seu novo RG é: " + rg);
		} else{
			System.out.println("Opção invalida!");
		}
	}

	public static void excluirPessoa(){
		pessoa = null;
		System.out.println("Pessoa excluida com sucesso!");
	}
}
