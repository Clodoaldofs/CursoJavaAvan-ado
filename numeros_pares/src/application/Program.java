package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Number;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, num;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		Number[] vet = new Number[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			vet[i] = new Number(num);
		}	
		
		int somaPares = 0;
		for(int i=0; i<n; i++) {
			if(vet[i].getNum()%2 == 0) {
				somaPares++;
			}
		}
				
		System.out.printf("\nNUMEROS PARES:\n");
		for(int i=0; i<n; i++) {
			if(vet[i].getNum()%2 == 0) {
				System.out.print(vet[i].getNum()+" ");
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d", somaPares);
		
		
		sc.close();
	}

}
