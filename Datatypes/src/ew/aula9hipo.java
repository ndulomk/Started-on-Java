package ew;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class aula9hipo {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter the side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		int more = 4;
		
		JOptionPane.showMessageDialog(null, more);
		System.out.println("The value of Hypotenus is: "+ z);
		scanner.close();
		
	}

}
