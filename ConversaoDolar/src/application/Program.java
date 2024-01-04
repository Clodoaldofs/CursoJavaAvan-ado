package application;

import java.util.Locale;
import java.util.Scanner;
import Util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar prince? ");
		CurrencyConverter.value = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.dollar = sc.nextDouble();
		double reais = CurrencyConverter.converter(); 
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", reais));
		
	}

}
