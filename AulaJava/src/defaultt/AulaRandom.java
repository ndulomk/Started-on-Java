package defaultt;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class AulaRandom {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(10)+1;
		double y = random.nextDouble(); 
		boolean z = random.nextBoolean();
		
//		System.out.println(x);
//		JOptionPane.showMessageDialog(null, x);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's play a game, u have to discover what i will think next between 1 and 10");
		int sort = scanner.nextInt();
		if(sort == x) {
			System.out.println("You Won!!");
		}
		else {
			System.out.println("The number is " +x+" I'm better than you hahah");
		}
		scanner.close();
		

	}

}
