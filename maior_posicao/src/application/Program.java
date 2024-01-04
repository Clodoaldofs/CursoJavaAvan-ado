package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Number;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double num;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		Number[] vet = new Number[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			num = sc.nextDouble();
			vet[i] = new Number(num);
		}
		double maiorValor = 0;
		int posicaoMaior = 0;
		for(int i=0; i<n; i++) {
			if(vet[i].getNum()>maiorValor) {
				maiorValor = vet[i].getNum();
				posicaoMaior = i;	
			}
		}
		
		System.out.println("\nMAIOR VALOR = "+ String.format("%.1f", maiorValor));
		System.out.print("POSICAO DO MAIOR VALOR = " + posicaoMaior);
		
		sc.close();
	}

}
