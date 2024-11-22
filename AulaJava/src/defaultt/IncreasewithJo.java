package defaultt;

import javax.swing.JOptionPane;

public class IncreasewithJo {
	public static void main(String[] args) {
		double value = Double.parseDouble(JOptionPane.showInputDialog("Enter the value you want bellow: "));
		double percent = Double.parseDouble(JOptionPane.showInputDialog("Enter the percent you want"))/100;
		String answer = JOptionPane.showInputDialog("You want what Decrease or Increase?[I/D] ");
		double finalValue = 0;
		if(answer.equalsIgnoreCase("I")) {
			finalValue = value + (value * percent);
			JOptionPane.showMessageDialog(null, "The final value is: "+finalValue);
		}
		else if(answer.equalsIgnoreCase("D")) {
			finalValue = value - (value * percent);
			JOptionPane.showMessageDialog(null, "The final value is: "+finalValue);
		}
		
		
	}

}
