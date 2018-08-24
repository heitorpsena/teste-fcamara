package br.com.fcamara.questao5;

public class ContaCorrente {
	private int numeroDaConta;
	private String nomeDoCorrentista;
	private double saldo;

	public ContaCorrente(int numeroDaConta, String nomeDoCorrentista) {
		this(numeroDaConta, nomeDoCorrentista, 0);
	}

	public ContaCorrente(int numeroDaConta, String nomeDoCorrentista, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCorrentista = nomeDoCorrentista;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void alterarNome(String nomeDoCorrentista) {
		this.nomeDoCorrentista = nomeDoCorrentista;
	}

	public void imprime() {
		System.out.println("Titular da Conta: " + this.nomeDoCorrentista + "\nNumero da Conta: " + this.numeroDaConta + "\nSaldo Atual: " + this.saldo);
	}

	public void deposito(double valorASerDepositado) {
		if (valorASerDepositado < 0) {
			throw new RuntimeException("Valor invalido!");
		}
		this.saldo += valorASerDepositado;
	}

	public void saque(double valorASerSacado) {
		if (this.saldo < valorASerSacado) {
			throw new RuntimeException("Saldo: " + this.saldo + ", Valor do saque: " + valorASerSacado + " ---- Saldo insuficiente!");
		}
		this.saldo -= valorASerSacado;
	}
}
