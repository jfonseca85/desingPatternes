package br.com.alura.strategy;

public class TesteCalculaImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		CalculaIMposto calculaIMposto = new CalculaIMposto();
		calculaIMposto.calculaTaxa(orcamento, icms);
		calculaIMposto.calculaTaxa(orcamento, iss);

		
	}

}
