package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double num;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		Numbers[] vet = new Numbers[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			num = sc.nextDouble();
			vet[i] = new Numbers(num);
		}
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += vet[i].getNum();
		}
		double average = sum / n;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f", average);
		
		System.out.printf("\nELEMENTOS ABAIXO DA MEDIA:");
		for(int i=0; i<n; i++) {
			if(vet[i].getNum() < average) {
				System.out.printf("\n%.1f", vet[i].getNum());
			}
		}
		
		sc.close();
	}

}
