package ew;

import javax.swing.JOptionPane;


public class Gui {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		
		JOptionPane.showMessageDialog(null,"Hello "+ name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
		JOptionPane.showMessageDialog(null,"Your are "+ age+" Years old");
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your heigh"));
		JOptionPane.showMessageDialog(null,"You have" +height);
		if(height > 190) {
			JOptionPane.showMessageDialog(null," Your shold play basket" );
		}
		else {
			JOptionPane.showMessageDialog(null, "Short");
		}
		
		
		
		
	}

}
