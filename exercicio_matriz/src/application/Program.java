package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as dimensões da MATRIZ: ");
		int m = sc.nextInt(), n = sc.nextInt();
		
		
		Numbers[][] mat = new Numbers[m][n];
		
		System.out.println("Digite os VALORES: ");
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				int number = sc.nextInt();
				mat[i][j] = new Numbers(number);				
			}
		}
		
		System.out.println("Qual o valor de X? ");
		int x = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j].getNumber() == x) {
					System.out.println("Position " + i + "," + j);
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1].getNumber());
					}		
					if(i>0) {
						System.out.println("Up: " + mat[i-1][j].getNumber());
					}
					if(j<m) {
						System.out.println("Right: " + mat[i][j+1].getNumber());						
					}					
					if(i<n) {
						System.out.println("Down: " + mat[i+1][j].getNumber());
					}
				}						
			}
		}
				
		sc.close();
	}

}
