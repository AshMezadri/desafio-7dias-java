package Exercicio22;

import java.util.Scanner;

public class Main {

	public static void pares(int array[], int valor) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {

				if (array[i] + array[j] == valor) {
					System.out.println(array[i] + " + " + array[j] + " = " + valor);
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros dos arrays : ");

		Integer n = Integer.valueOf(leitura.nextLine());

		int[] array = new int[n];

		System.out.println("Informe o valor especifico a ser encontrado : ");

		int valor = Integer.valueOf(leitura.nextLine());

		System.out.println("Informe os valores do array : ");

		for (int i = 0; i < array.length; i++) {

			array[i] = Integer.valueOf(leitura.nextLine());

		}
		
		pares(array,valor);

	}

}
