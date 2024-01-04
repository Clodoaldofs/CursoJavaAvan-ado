package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Guests;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name, email;
		int n, room;
		
		System.out.printf("How many rooms will be rented? ");
		n = sc.nextInt();
		
		Guests[] guests = new Guests[10];
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Rent #%d: \n", i+1);
			System.out.printf("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.printf("Email: ");
			email = sc.nextLine();
			System.out.printf("Room: ");
			room = sc.nextInt();
			guests [room] = new Guests(name, email, room);
			
			
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i=0; i<10; i++) {
			if(guests[i] != null) {
				System.out.printf("%d: %s, %s \n",guests[i].getRoom(), guests[i].getName(), guests[i].getEmail()); 
				
				
			}
		}
		
		sc.close();
	}

}
