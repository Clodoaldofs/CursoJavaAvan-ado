package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		String name;
		int age = 0;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		People[] vet = new People[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.printf("Nome: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Idade: ");
			age = sc.nextInt();
			vet[i] = new People(name, age);
			}
			int compare = vet[0].getAge();
			String older = vet[0].getName();
			for(int i=1; i<n; i++) {
				if (compare < vet[i].getAge()) {
					older = vet[i].getName();
					compare = vet[i].getAge();
				}
			}
			System.out.printf("PESSOA MAIS VELHA: %s", older);
			
			
		sc.close();
		}
}
