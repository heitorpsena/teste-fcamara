package br.com.fcamara.questao4;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho em metros quadrados da area a ser pintada: ");
		double metros = scanner.nextDouble();
		double litros = Math.ceil(metros / 3);
		int latas = (int) Math.ceil(litros / 18);
		System.out.println(String.format("Voce precisa de %d latas no valor de %.2f reais", latas, (latas * 80.0)));
	}
}
