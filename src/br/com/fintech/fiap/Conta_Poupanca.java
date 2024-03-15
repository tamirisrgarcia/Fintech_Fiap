package br.com.fintech.fiap;

public class Conta_Poupanca extends Conta {

    private double taxaRendimento;

    public Conta_Poupanca(int id_conta, int nr_conta, int agencia, double saldo, String tipo, double taxaRendimento) {
        super(id_conta, nr_conta, agencia, saldo, tipo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

}