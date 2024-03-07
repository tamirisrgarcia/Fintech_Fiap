package br.com.fintech.fiap;

import java.util.Date;

public class Suporte {
	
	private int id_atendimento;
	private int id_atendente;
	private Date dt_atendimento;
	private int protocolo_atendimento;
	private String ds_tempo_resposta;
	private String ds_contato;
	
	public Suporte(int id_atendimento, int id_atendente, Date dt_atendimento, int protocolo_atendimento,
			String ds_tempo_resposta, String ds_contato) {
		super();
		this.id_atendimento = id_atendimento;
		this.id_atendente = id_atendente;
		this.dt_atendimento = dt_atendimento;
		this.protocolo_atendimento = protocolo_atendimento;
		this.ds_tempo_resposta = ds_tempo_resposta;
		this.ds_contato = ds_contato;
	}

	public Date getDt_atendimento() {
		return dt_atendimento;
	}

	public void setDt_atendimento(Date dt_atendimento) {
		this.dt_atendimento = dt_atendimento;
	}

	public String getDs_tempo_resposta() {
		return ds_tempo_resposta;
	}

	public void setDs_tempo_resposta(String ds_tempo_resposta) {
		this.ds_tempo_resposta = ds_tempo_resposta;
	}

	public String getDs_contato() {
		return ds_contato;
	}

	public void setDs_contato(String ds_contato) {
		this.ds_contato = ds_contato;
	}

	public int getId_atendimento() {
		return id_atendimento;
	}

	public int getId_atendente() {
		return id_atendente;
	}

	public int getProtocolo_atendimento() {
		return protocolo_atendimento;
	}
	
	public void setProtocolo_atendimento(int id_atendimento) {
		this.id_atendimento = id_atendimento;
	}

	public void solicitarAtendimento() {
		
	}
	
	public void concluirAtendimento(int id_atendimento) {
		
	}
	
	public void cancelarAtendimento(int id_atendimento) {
		
	}
	
	public void consultarAtendimento(int id_atendimento) {
		
	}
	
	public void confirmacaoIdentidade(int id_usuario) {
		
	}
}