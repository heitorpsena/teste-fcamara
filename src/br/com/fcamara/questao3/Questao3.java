package br.com.fcamara.questao3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero de horas: ");
		int horas = scanner.nextInt();
		
		System.out.println("Digite o valor do salario minimo: ");
		double valorDoSalario = scanner.nextDouble();
		
		double valorHora = valorDoSalario * 0.1;
		double salarioBruto = horas * valorHora;
		double salarioLiquido = salarioBruto - (salarioBruto * 0.03);
		
		System.out.printf("Seu salario e no valor de: %.2f", salarioLiquido);
		
		
	}

}
