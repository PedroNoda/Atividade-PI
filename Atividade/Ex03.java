package Prova;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double massa[] = new double[1]; 
		int tempo = 0;
		int hora = 0, minuto = 0, segundo = 0;

		System.out.println("Informe a massa inicial do \ncomponente radioativo (gramas): ");
		massa[0] = sc.nextDouble();
 
		while (massa[0] >= 0.5) {
			massa[0] = massa[0] / 2;
			tempo = tempo + 50;
		} 

		while (tempo >= 3600) {
			hora++;
			tempo = tempo - 3600;
		}

		while (tempo >= 60) {
			minuto++;
			tempo = tempo - 60;
		} 

		while (tempo < 60 && tempo > 0) {
			segundo++;
			tempo = tempo - 1;
		}

		System.out.println("Horas: " + hora + " | Minutos: " + minuto + " | Segundos: " + segundo);

		sc.close();
	}
}
