package Exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros dos arrays : ");

		Integer N = Integer.valueOf(leitura.nextLine());

		int[] array = new int[N];
		
		
		System.out.println("Informe os valores do array : ");

		for (int i = 0; i < array.length; i++) {

			array[i] = Integer.valueOf(leitura.nextLine());
		}
		
		System.out.println("Array original: " );
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Array reverso: " );
		
		for (int j = N - 1; j >= 0; j--) {
			System.out.println(array[j]);
		}

	}

}
