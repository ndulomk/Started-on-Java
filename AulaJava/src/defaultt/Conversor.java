package defaultt;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value you want to convert ");
		double value = scanner.nextDouble();
		scanner.nextLine();
		double km = value / 1000;
		double hm = value / 100;
		double dam = value / 10;
		double dm = value * 10;
		double cm = value * 100;
		double mm = value * 1000;
		System.out.println("You want to convert for what measure type? ");
		String measure = scanner.nextLine();
		
		switch (measure) {
			case "km": System.out.println("The direct convert is "+ km); 
			break;
			case "hm": System.out.println("The direct convert is "+hm);
			break;
			case "dam":System.out.println("The direct convert is "+dam);
			break;
			case "dm":System.out.println("The direct convert is "+dm);
			break;
			case "cm":System.out.println("The direct convert is "+cm);
			break;
			case "mm":System.out.println("The direct convert is "+mm);
			break;
			
		}
		System.out.println("thanks");

	}

}
