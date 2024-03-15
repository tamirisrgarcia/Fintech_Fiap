package br.com.fintech.fiap;


public class Suporte {
	
	private int id_atendimento;
	private int id_atendente ;
	private String dt_atendimento;
	private int protocolo_atendimento;
	private String ds_tempo_resposta;
	private String ds_contato;
	private Boolean status;
	static Suporte suporte;
	
	public Suporte(int id_atendimento, int id_atendente, String dt_atendimento, int protocolo_atendimento,String ds_tempo_resposta, String ds_contato, Boolean status) {
		super();
		this.id_atendimento = id_atendimento;
		this.id_atendente = id_atendente;
		this.dt_atendimento = dt_atendimento;
		this.protocolo_atendimento = protocolo_atendimento;
		this.ds_tempo_resposta = ds_tempo_resposta;
		this.ds_contato = ds_contato;
		this.status = status;
	}

	public Boolean getsStatus(){
		return status;
	}

	public void setStatus(Boolean status){
		this.status = status;
	}

	public String getDt_atendimento() {
		return dt_atendimento;
	}

	public void setDt_atendimento(String dt_atendimento) {
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

	public static void solicitarAtendimento(int id_atendimento, int id_atendente, String dt_atendimento, int protocolo_atendimento,String ds_tempo_resposta, String ds_contato, Boolean status) {
		suporte = new Suporte(id_atendimento, id_atendente, dt_atendimento, protocolo_atendimento, ds_tempo_resposta, ds_contato, status);
		suporte.status = true;
		suporte.id_atendente = Funcionario.funcionario.getNr_registro();
		System.out.println("Atendimento inciadop com sucesso!");
	}
	
	public void concluirAtendimento() {
		status = true;
		System.out.println("Atendimento concluido com sucesso!");
	}
	
	public void cancelarAtendimento() {
		status = false;
		System.out.println("Atendimento cancelado!");
	}
	
	public void consultarAtendimento() {
		System.out.println("Atendimento: " + protocolo_atendimento +"\nNumero do atendente: " + id_atendente + "\nData do atendimento : " + dt_atendimento + "\nTempo estimando para resposta: " + ds_tempo_resposta + "\nStatus do atendimento (concluido ou não): " + status + "\nPara mais informações entre e contato conosco: " + ds_contato);
	}
	
}
