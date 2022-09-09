package Prova;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int ano[] = new int[27];
		double salarioAno[] = new double[27];
		ano[0] = 1996;
		double porcentagem=0.015;
		double salario = 1000;
		
		for (int i = 0; i < ano.length; i++) {
			salario += salario * porcentagem;
			porcentagem = porcentagem * 2;
			salarioAno[i] = salario;
		}
		
		System.out.println("Salario 2022");
		System.out.printf("%.2f \n", salarioAno[26]);
	sc.close(); 
	}
}
