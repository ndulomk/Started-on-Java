package data;

import java.util.Scanner;

public class Fecthing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name? ");
		String name = scanner.nextLine();
		
		System.out.println("What's your email? ");
		String email = scanner.nextLine();
		
		System.out.println("What's your phone number? ");
		int phone = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What's your password? ");
		int password = scanner.nextInt();
		
		System.out.println("Confirm your passoword!");
		int cpass = scanner.nextInt();
		
		if(password == cpass) {
			System.out.println("Your name is "+name+" And your email is "+email+"And your user phone is"+phone);
		}
		else {
			System.out.println("Wrong");
		}
	

	}

}
