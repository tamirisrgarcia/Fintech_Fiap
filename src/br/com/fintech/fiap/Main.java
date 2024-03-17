package br.com.fintech.fiap;

public class Main {
	public static void main(String[] args) {

		Funcionario.incluirFuncionario(123, "João Vitor", "joaocorp@gmail.com", 1234, "Atendente", 456.789, 23.456, "27/02/2004", "FOTO");

		Funcionario.funcionario.consultarFuncionario();


		Suporte.solicitarAtendimento(123, 0, "19/03", 789, "2 dias uteis", "Email: fintech@gmail.com | Telefone: (11)2233-4455", false);
		
		Suporte.suporte.consultarAtendimento();
		
		Conta_Corrente conta = new Conta_Corrente(1, 123, 987, 2000.0, "corrente", 0.6, true);

		System.out.println(conta.calcularTaxaChequeEspecial(0.5));
		System.out.println(conta.calcularTaxaJuros(2));
		

		Conta_Poupanca cp = new Conta_Poupanca(22, 999, 22, 5000.0, "poupança", 2);
		System.out.println(cp.calcularRendimento());
	}
}
