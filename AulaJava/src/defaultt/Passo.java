package defaultt;

import java.util.Scanner;

public class Passo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert an number: ");
		int number = input.nextInt();
		System.out.println("Insert the step: ");
		int step = input.nextInt();
		System.out.println("Insert the final value: ");
		int value = input.nextInt();
		
		for(int n = number;n <=value;n+=step) {
			System.out.println(n);
		}

	}

}
