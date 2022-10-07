package Exercicio27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		int[] numeros = { 2, 4, 7, 9, 6, 10};
		int numerosPares = 0 ;
		int numerosImpares = 0 ;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] %2== 0 ) {
				numerosPares ++;
			}else {
				numerosImpares ++;
			}
		}
		
		System.out.println("Quantidade de numeros pares: " + numerosPares);
		System.out.println("Quantidade de numeros impares: " + numerosImpares);
		
		
	}

}
