package data;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Whats is your name?");
		String name = scanner.nextLine();
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Whats your favorite meal?");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are " + age +" Years old");
		System.out.println("You like " + food);

	}

}
