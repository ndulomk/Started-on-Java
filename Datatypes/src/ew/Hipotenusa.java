package ew;

import java.util.Scanner;
public class Hipotenusa {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -18;
		int number = 25;
		
		double min = Math.min(x, y);
		double max = Math.max(x, y);
		double absolute = Math.round(number);
		
		System.out.println("The highest number between x and y is: "+max+"The number with less value is: " + min);
		System.out.println(absolute);
	}

}
