package Exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner Leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros a serem verificados: ");

		Integer N = Integer.valueOf(Leitura.nextLine());

		int[] Array = new int[N];

		System.out.println("Informe os valores: ");

		for (int i = 0; i < Array.length; i++) {
			Array[i] = Integer.valueOf(Leitura.nextLine());

		}
		
		
		
		int Maior = Array[0];

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] > Maior) {
				Maior = Array[i];
			}
		}

		int Menor = Array[0];

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] < Menor) {
				Menor = Array[i];
			}
		}

		
		
		System.out.println("O maior numero e: " + Maior);
		System.out.println("O menor numero e: " + Menor);

	}

}
