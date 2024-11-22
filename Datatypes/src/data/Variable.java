package data;

public class Variable {

	public static void main(String[] args) {
		
		String x = "Water";
		String y = "Caveneno";
		String temp;
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("x: " + x);
		System.out.println("y: "+ y);
	}

}
