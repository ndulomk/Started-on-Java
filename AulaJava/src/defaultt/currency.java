package defaultt;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class currency {

	public static void main(String[] args) {
		
		double real = 5.27;
		double dolar = 900;
		double finalvalue = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much you have in your wallet? ");
		double moeda = Double.parseDouble(JOptionPane.showInputDialog("Enter the value you have to convert bellow"));
		String currency = JOptionPane.showInputDialog("We have conversion for dolar and real to kwanza, wicth one you want? ");
		if(currency.equalsIgnoreCase("dolar")) {
			finalvalue = moeda / dolar;
			JOptionPane.showMessageDialog(null,"it's actual"+ finalvalue +"$");
//			System.out.println("It's actual "+finalvalue);
		}
		else if(currency.equalsIgnoreCase("real")) {
			finalvalue = moeda / real;
			JOptionPane.showMessageDialog(null,"It's actual"+ finalvalue + "R$");
//			System.out.println("It's actual"+finalvalue);
		}
		

	}

}
