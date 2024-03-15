package br.com.fintech.fiap;

public class Main {
	public static void main(String[] args) {
		Funcionario.incluirFuncionario(123, "testen", "testem", 1234, "testec", 456, 23, "2786", "testef");

		Suporte.solicitarAtendimento(123, 0, "testedt", 2, "x dias uteis", "testect", false);
		
		Suporte.suporte.consultarAtendimento();
		
		Conta_Corrente conta = new Conta_Corrente(1, 123, 987, 2000.0, "corrente", 0.6, true);
		System.out.println(conta.calcularTaxaChequeEspecial(0.5));
		System.out.println(conta.calcularTaxaJuros(2));
		
		Conta_Poupanca cp = new Conta_Poupanca(22, 999, 22, 5000.0, "poupança", 2);
		System.out.println(cp.calcularRendimento());
	}
}
