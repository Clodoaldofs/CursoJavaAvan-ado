package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, num;
		double sumPairs, averagePairs, accountPairs;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		Numbers[] vet = new Numbers[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			num = sc.nextInt();
			vet[i] = new Numbers(num);
		}

		sumPairs = 0;
		accountPairs = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i].getNum() % 2 == 0) {
				sumPairs += vet[i].getNum();
				accountPairs++;
			}
		}
		averagePairs = sumPairs / accountPairs;

		if (accountPairs != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", averagePairs);

		} else {
			System.out.printf("NENHUM NUMERO PAR ");

		}

		sc.close();
	}

}
