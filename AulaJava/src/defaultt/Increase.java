package defaultt;

import java.util.Scanner;

public class Increase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to services of convert");
		System.out.println("Insert the value: ");
		double value = scanner.nextDouble();
		double finalValue = 0;
		
		System.out.println("What the percent of? ");
		double percent = scanner.nextDouble()/100;
		scanner.nextLine();
		System.out.println("You want what option the decrease or increase?[I/D] ");
		String answer = scanner.nextLine();
		if(answer.equalsIgnoreCase("I")) {
			finalValue = value + (value * percent);
			System.out.println("The final value is: "+finalValue);
		}
		else if(answer.equalsIgnoreCase("D")) {
			
			finalValue = value - (value * percent);
			System.out.println("the final value is: "+finalValue);
		}

	}

}
