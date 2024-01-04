package entities;

import java.util.Locale;
import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, perimetro, diagonal;
		
		Rectangle rectangle = new Rectangle();

		
		System.out.println("Enter rectangle width and height:");
		rectangle.windth = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		area = rectangle.area();
		perimetro = rectangle.perimeter();
		diagonal = rectangle.diagonal();
		
		System.out.println("Area = " + String.format("%.2f", area));
		System.out.println("Perimetro = " + String.format("%.2f", perimetro));
		System.out.println("Diagonal = " + String.format("%.2f", diagonal));
		
		sc.close();
	}

}
