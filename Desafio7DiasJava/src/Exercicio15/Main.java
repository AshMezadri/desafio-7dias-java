package Exercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner Leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros dos arrays : ");

		Integer N = Integer.valueOf(Leitura.nextLine());

		int[] Array1 = new int[N];
		int[] Array2 = new int[N];

		System.out.println("Informe os valores do array 1: ");

		for (int i = 0; i < Array1.length; i++) {

			Array1[i] = Integer.valueOf(Leitura.nextLine());
		}

		System.out.println("Informe os valores do array 2: ");

		for (int j = 0; j < Array2.length; j++) {

			Array2[j] = Integer.valueOf(Leitura.nextLine());
		}

		for (int i = 0; i < Array1.length; i++) {
			
			for (int j = 0; j < Array2.length; j++) {

				if (Array1[i] == Array2[j]) {
					System.out.println("Numero em comum: " + Array1[i]);
				}
			}
		}
		
	}

}
