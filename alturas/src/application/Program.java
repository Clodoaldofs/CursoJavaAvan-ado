package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoais;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, idade;
		double altura;
		String nome;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		DadosPessoais[] vect = new DadosPessoais[90];
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da "+ i + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			vect[i] = new DadosPessoais(nome, idade, altura);
		}
		
		double media;
		double soma = 0;
		for (int i=1; i<=n; i++) {
			soma += vect[i].getAltura();
		}
		media = soma/n;
		
		soma = 0;
		for (int i=1; i<=n; i++) {
			if(vect[i].getIdade()<16) {
				soma++;
			}
			
		}
		double porcent = soma / n * 100;
		
		System.out.printf("\nAltura média: %.2f", media);
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", porcent);
		for (int i=1; i<=n; i++) {
			if(vect[i].getIdade()<16) {
				System.out.println(vect[i].getNome());
			}
			
		}
		
		
		sc.close();
	}
}
		