package br.com.fcamara.questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Forneca dois numeros separados por espaço");
		String[] numeros = scanner.nextLine().trim().split(" ");
		int inicial = 0;
		int valorFinal = 0;

		List<Integer> numerosPrimos = new ArrayList<>();

		try {
			inicial = Integer.parseInt(numeros[0]);
			valorFinal = Integer.parseInt(numeros[1]);
		} catch (Exception e) {
			System.out.println("Voce nao forneceu numeros");
		}

		for (int i = inicial; i <= valorFinal; i++) {
			int contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador++;
				}
				if (contador == 2 && j == i) {
					numerosPrimos.add(i);
				}
			}
		}

		System.out.println(numerosPrimos);
	}
}
