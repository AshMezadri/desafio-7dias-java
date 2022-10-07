package Exercicio4;

import java.util.Scanner;

public class Main {

	private static final Scanner Leitura = null;

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros do array: ");

		Integer N = Integer.valueOf(Leitura.nextLine());

		int[] vetor = new int[N];
		int soma = 0;
		float media;
		
		System.out.println("Informe os valores: ");

		for (int i = 0; i < vetor.length; i++) {
			
			vetor[i] = Integer.valueOf(Leitura.nextLine());
			soma = soma+vetor[i];
		}
		
		media = soma / vetor.length;
		
		System.out.println("A media dos valores e: "+media);
		
	}

}
