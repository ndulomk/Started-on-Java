package defaultt;

import java.util.Random;

public class arr {

	public static void main(String[] args) {
		
		String[] car = {"Camaro", "Corvete", "Tesla"};
		
		car[0] = "Mustang";
			
		System.out.println(car.length);
		
		Random random = new Random();
		int[] mine = new int[10];
		int x = random.nextInt(20);
		for(int n = 0;n<10;n++) {
			mine[n] = x;
			System.out.println(mine);
		}
		
		
		
	}

}
