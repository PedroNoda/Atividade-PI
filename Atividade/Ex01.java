package Prova;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int vetor[] = new int[5];
	int maior=0, menor=0;	
	
	for(int cont = 0; cont < 5; cont++) {
		System.out.println("Informe um valor: ");
		vetor[cont] = sc.nextInt();
			menor = vetor[0];
			maior = vetor[0]; 
		if (vetor[cont] < menor) {
			menor = vetor[cont];
		} else if (vetor[cont] > maior) {
			maior = vetor[cont];
		}
	}
	
	for(int num : vetor) {
		System.out.printf("%d, ", num);
	}
	
	System.out.println(" ");
	
	System.out.println("O maior valor é: " + maior);
	System.out.println("O menor valor é: " + menor);
	
		
	sc.close();
	}
}
