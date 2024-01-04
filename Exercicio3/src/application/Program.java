package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Notas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas grades = new Notas();
		
		System.out.println("Digite os dados do aluno: Nome, e Notas.");
		grades.name = sc.nextLine();
		grades.note1 = sc.nextDouble();
		grades.note2 = sc.nextDouble();
		grades.note3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(grades);
		sc.close();
		
		

	}

}
