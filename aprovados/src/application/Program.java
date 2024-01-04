package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		String name;
		double grade1, grade2, averageGrade;
		
		
		System.out.printf("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		Students[] students = new Students[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i+1);
			sc.nextLine();
			name = sc.nextLine();
			grade1 = sc.nextDouble();
			grade2 = sc.nextDouble();
			students[i] = new Students(name, grade1, grade2);
		}
		
		System.out.printf("Alunos aprovados:\n");
		
		for(int i=0; i<n; i++) {
			averageGrade = (students[i].getGrade1() + students[i].getGrade2())/2;			
			if(averageGrade >= 6.0) {
				System.out.println(students[i].getName());
			}
			
		}
		
		sc.close();
		
	}

}
