package defaultt;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert the number to see the product: ");
		int number = input.nextInt();
		for(int n = 0;n<=12;n++) {
			int prod = number * n;
			System.out.println(number +" * "+n+" = "+prod);
		}

	}

}
