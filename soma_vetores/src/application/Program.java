package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Vectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, num;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		Vectors[] vetA = new Vectors[n];
		Vectors[] vetB = new Vectors[n];
		Vectors[] vetC = new Vectors[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			vetA[i] = new Vectors(num);
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			vetB[i] = new Vectors(num);
		}
		
		for (int i = 0; i < n; i++) {
			num = vetA[i].getNum() + vetB[i].getNum();
			vetC[i] = new Vectors(num);
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < n; i++) {
			num = vetA[i].getNum() + vetB[i].getNum();
			System.out.println(vetC[i].getNum());
		}
			
		sc.close();
	
	}

}
