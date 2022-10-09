package Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros dos arrays : ");

		Integer N = Integer.valueOf(leitura.nextLine());

		int[] array = new int[N];

		System.out.println("Informe os valores do array : ");

		int soma = 0;
		
		for (int i = 0; i < array.length; i++) {

			array[i] = Integer.valueOf(leitura.nextLine());
			soma = soma + array[i];
		}
		
		System.out.println("Valor da soma dos valores do vetor: " + soma);
	}
	

}
