package defaultt;

import java.util.Scanner;

public class Aluguel {

	public static void main(String[] args) {
		
		int custoD = 60;
		double custokm = 0.5;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Good morning, the value per day is 60R$ and per km is 2$");
		System.out.println("How many days you will stay with the car?");
		int dia = scanner.nextInt();
		System.out.println("And how much km you will drive? ");
		int km = scanner.nextInt();
		int prod1 = custoD * dia;
		double prod2 = (double) custokm * km;
		double total = prod1 + prod2;
		System.out.println("You have to pay "+total+"R$");
		

	}

}
