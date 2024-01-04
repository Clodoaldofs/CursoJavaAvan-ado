package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double height, mediaMulheres, menorAltura, maiorAltura;
		char gender;

		System.out.print("Quantas pessoas serao digitadas?");
		n = sc.nextInt();

		People[] people = new People[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			height = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			gender = sc.next().charAt(0);
			people[i] = new People(height, gender);
		}

		menorAltura = people[0].getHeight();
		for (int i = 1; i < n; i++) {
			if (menorAltura > people[i].getHeight()) {
				menorAltura = people[i].getHeight();
			}
		}

		maiorAltura = people[0].getHeight();
		for (int i = 1; i < n; i++) {
			if (maiorAltura < people[i].getHeight()) {
				maiorAltura = people[i].getHeight();
			}
		}

		double somaAltura = 0;
		int somaMulheres = 0, somaHomens = 0;
		for (int i = 0; i < n; i++) {
			if (people[i].getGender() == 'F') {
				somaAltura += people[i].getHeight();
				somaMulheres++;
			} else {
				somaHomens++;
			}

		}

		mediaMulheres = somaAltura / somaMulheres;

		System.out.printf("Menor altura = %.2f \n", menorAltura);
		System.out.printf("Maior altura = %.2f \n", maiorAltura);

		if (somaMulheres != 0) {
			System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
		} else {
			System.out.printf("Nenhuma mulher digitada\n");
		}
		System.out.printf("Numero de homens = %d", somaHomens);

		sc.close();

	}

}
