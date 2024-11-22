package defaultt;

import java.util.Random;
import java.util.Scanner;

public class repetition {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int x = random.nextInt(1, 20);
		String name = "";
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();		
			
		}
		System.out.println("Hello " + name);
		scanner.close();
	}
}
