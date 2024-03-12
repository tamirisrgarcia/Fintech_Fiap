package br.com.fintech.fiap;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		Endereco.incluirEndereco(1, "Brasil", "São Paulo", "São Paulo", "Parque São Lucas", "Rosario do Catete", 477);

		Endereco.endereco.consultarEndereco();
		
		Endereco.endereco.editarEndereco();
		Endereco.endereco.consultarEndereco();

	}
}
