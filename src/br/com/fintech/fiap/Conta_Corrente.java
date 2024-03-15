package br.com.fintech.fiap;

public class Conta_Corrente extends Conta {
    
    private double taxaJuros;
    private boolean chequeEspecial;

    public Conta_Corrente(int id_conta, int nr_conta, int agencia, double saldo, String tipo, double taxaJuros, boolean chequeEspecial) {
        super(id_conta, nr_conta, agencia, saldo, tipo);
        this.taxaJuros = taxaJuros;
        this.chequeEspecial = chequeEspecial;
    }

    public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

    public boolean getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}


}
