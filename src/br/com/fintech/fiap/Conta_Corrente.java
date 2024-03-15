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

    public String calcularTaxaJuros(double valor) {
        double taxa =  valor * taxaJuros / 100;
        return "A taxa de juros da sua conta é de: " + taxa;
    }

    public String calcularTaxaChequeEspecial(double valor) {
        if (chequeEspecial) {
        	double taxa = getSaldo() * (valor * 0.02);
            return "A taxa do Cheque Especial da sua conta é de R$" + taxa;
        } else {
            return "A sua conta não possui taxa de Cheque Especial";
        }
    }

}
