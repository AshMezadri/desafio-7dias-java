package Exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner Leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros a serem verificados: ");

		Integer N = Integer.valueOf(Leitura.nextLine());

		int[] Array = new int[N];
		int Maior = 0;
		int Menor = 0;

		System.out.println("Informe os valores: ");

		for (int i = 0; i < Array.length; i++) {
			Array[i] = Integer.valueOf(Leitura.nextLine());
		}

		Maior = Main.verificaMaior(Array);

		Menor = Main.verificaMenor(Array);

		System.out.println("O maior numero e: " + Maior);
		System.out.println("O menor numero e: " + Menor);

	}

	public static int verificaMaior(int Array[]) {

		int Valor = 0;

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] > Valor) {
				Valor = Array[i];
			}
		}

		return Valor;
	}

	public static int verificaMenor(int Array[]) {

		int Valor = Array[0];

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] < Valor) {
				Valor = Array[i];
			}
		}

		return Valor;
	}
}
