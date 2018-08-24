package br.com.fcamara.questao6;

import java.util.Scanner;

public class TestaRetangulo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double dimensaoLajota = 0.5;
		double comprimentoRodape = 0.3;

		System.out.println("Informe a base do local");
		double largura = scanner.nextDouble();

		System.out.println("Informe a altura do local");
		double altura = scanner.nextDouble();

		Retangulo retangulo = new Retangulo();

		retangulo.setValorDosLados(altura, largura);

		double area = retangulo.calculaArea();
		int quantidadeLajota = (int) Math.ceil(area / dimensaoLajota);

		double perimetro = retangulo.calculaPerimetro();
		int quantidadeRodape = (int) Math.ceil(perimetro / comprimentoRodape);

		System.out.println(String.format(
				"A area do espaco informado é de %.2f metros quadrados e precisa de %d lajotas no tamanho de %.1f metro quadrados",
				area, quantidadeLajota, dimensaoLajota));
		System.out.println(String.format(
				"O perimetro do espaco informado é de %.2f metros quadrados e precisa de %d rodapes no tamanho de %.1f metro",
				perimetro, quantidadeRodape, comprimentoRodape));

	}
}
