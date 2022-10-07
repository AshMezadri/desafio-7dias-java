package Exercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros dos arrays : ");

		Integer N = Integer.valueOf(leitura.nextLine());

		int[] array1 = new int[N];
		int[] array2 = new int[N];

		System.out.println("Informe os valores do array 1: ");

		for (int i = 0; i < array1.length; i++) {

			array1[i] = Integer.valueOf(leitura.nextLine());
		}

		System.out.println("Informe os valores do array 2: ");

		for (int j = 0; j < array2.length; j++) {

			array2[j] = Integer.valueOf(leitura.nextLine());
		}

		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j]) {
					System.out.println("Numero em comum: " + array1[i]);
				}
			}
		}
		
	}

}
