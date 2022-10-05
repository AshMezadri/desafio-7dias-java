package Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner Leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros do array: ");

		Integer N = Integer.valueOf(Leitura.nextLine());

		int[] Vetor = new int[N];
		int soma = 0;
		float media;
		
		System.out.println("Informe os valores: ");

		for (int i = 0; i < Vetor.length; i++) {
			
			Vetor[i] = Integer.valueOf(Leitura.nextLine());
			soma = soma+Vetor[i];
		}
		
		media = soma / Vetor.length;
		
		System.out.println("A media dos valores e: "+media);
		
	}

}
