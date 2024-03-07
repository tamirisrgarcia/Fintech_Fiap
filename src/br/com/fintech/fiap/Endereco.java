package br.com.fintech.fiap;

public class Endereco {

	private int id_endereco;
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int nr_casa;
	
	public Endereco(int id_endereco, String pais, String estado, String cidade, String bairro, String rua,
			int nr_casa) {
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
	
	public void consultarEndereco(int id_endereco) {
		
	}
	
	private void incluirEndereco() {
		
	}
	
	private void editarEndereco(int id_endereco) {
		
	}
	
	private void excluirEndereco(int id_endereco) {
		
	}
	
}
