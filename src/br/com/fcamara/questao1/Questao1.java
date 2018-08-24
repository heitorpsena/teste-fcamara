package br.com.fcamara.questao1;

import java.time.LocalDate;

public class Questao1 {

	private static double salario = 1000.0;
	private static double aumento = 0.015;

	public static void main(String[] args) {
		double valorAumento = salario * aumento;
		for (int i = 2006; i < LocalDate.now().getYear(); i++) {
			salario = salario + (valorAumento);
			valorAumento *= 2;
			System.out.printf("%.2f - %.3f \n", salario, valorAumento);
		}
	}

}
