package br.com.fcamara.questao5;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(001, "Heitor");
				
		cc.deposito(1000.0);
		cc.saque(500);
		
		cc.imprime();
		cc.alterarNome("Jose");
		cc.imprime();
		
	
	}

}
