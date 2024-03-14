package br.com.fintech.fiap;

public class Main {
	public static void main(String[] args) {
		Funcionario.incluirFuncionario(123, "testen", "testem", 1234, "testec", 456, 23, "2786", "testef");

		Suporte.solicitarAtendimento(123, 0, "testedt", 2, "x dias uteis", "testect", false);
		
		Suporte.suporte.consultarAtendimento();
		
	}
}
