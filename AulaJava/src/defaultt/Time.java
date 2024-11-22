package defaultt;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the actually hour: ");
		for(int n = 0;n<10;n++) {
			int time = input.nextInt();
			if(time < 5) {
				System.out.println("happy midnight");
			}
			else if(time < 12) {
				System.out.println("Good morning");
			}
			else if(time < 18) {
				System.out.println("Good afternoon");
			}
			else if(time <= 23) {
				System.out.println("Good Evennig");
			}
		}


	}

}
