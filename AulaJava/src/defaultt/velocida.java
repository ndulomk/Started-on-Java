package defaultt;

import java.util.Scanner;

public class velocida {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert the speed you are: ");
		int velocidade = scanner.nextInt();
		if(velocidade > 100) {
			System.out.println("You are out of the range of velocity that we allow");
			if(velocidade > 130) {
				System.out.println("You will going to the jail!!");
			}
		}
		else {
			System.out.println("Drive safe, use always and keep safe");
			if(velocidade < 30) {
				System.out.println("Tartaruga");
			}
		}
		

	}

}
