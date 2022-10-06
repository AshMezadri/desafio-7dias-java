package Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner Leitura = new Scanner(System.in);

		System.out.println("Informe a quantidade de numeros do array: ");

		Integer N = Integer.valueOf(Leitura.nextLine());

		int[] Vetor = new int[N];
		int Soma = 0;
		float Media;
		
		System.out.println("Informe os valores: ");

		for (int i = 0; i < Vetor.length; i++) {
			
			Vetor[i] = Integer.valueOf(Leitura.nextLine());
			Soma = Soma+Vetor[i];
		}
		
		Media = Soma / Vetor.length;
		
		System.out.println("A media dos valores e: "+Media);
		
	}

}
