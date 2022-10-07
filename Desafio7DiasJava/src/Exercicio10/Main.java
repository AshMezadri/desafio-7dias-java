package Exercicio10;

import java.util.Scanner;

public class Main {

	private static final Scanner Leitura = null;

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros a serem verificados: ");

		Integer N = Integer.valueOf(Leitura.nextLine());

		int[] array = new int[N];
		int maior = 0;
		int menor = 0;

		System.out.println("Informe os valores: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.valueOf(Leitura.nextLine());
		}

		maior = Main.verificaMaior(array);

		menor = Main.verificaMenor(array);

		System.out.println("O maior numero e: " + maior);
		System.out.println("O menor numero e: " + menor);

	}

	public static int verificaMaior(int Array[]) {

		int valor = 0;

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] > valor) {
				valor = Array[i];
			}
		}

		return valor;
	}

	public static int verificaMenor(int Array[]) {

		int valor = Array[0];

		for (int i = 1; i < Array.length; i++) {
			if (Array[i] < valor) {
				valor = Array[i];
			}
		}

		return valor;
	}
}
