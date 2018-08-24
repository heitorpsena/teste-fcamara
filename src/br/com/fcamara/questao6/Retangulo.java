package br.com.fcamara.questao6;

public class Retangulo {

	private double altura;
	private double base;

	public void setValorDosLados(double alturaNova, double baseNova) {
		this.altura = alturaNova;
		this.base = baseNova;
	}

	public void retornaValorDosLados() {
		System.out.println("A altura: " + this.altura + "\nA base: " + this.base);
	}

	public double calculaArea() {
		return this.altura * this.base;

	}
	
	public double calculaPerimetro() {
		return (this.altura + this.base) * 2;
	}

}
