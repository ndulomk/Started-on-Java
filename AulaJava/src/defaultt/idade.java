package defaultt;

import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		if(age < 18) {
			System.out.println("You have to worry only about the school");
			if(age < 14) {
				System.out.println("Kid try to do something good, go and do desport or someshit that will help you");
			
			}
			
		}
		else if(age < 30) {
			System.out.println("Bro you have "+age+" Bro you have to know what you want in true");
			if(age < 25) {
				System.out.println("Bro go find more knowlodge and if u can invest in your future");
			}
		}
		else if(age < 50) {
			System.out.println("Now is time make so much money og");
		}
		else if(age < 80) {
			System.out.println("If you are in this age and still broke, you are dumb ass");
		}
		else if(age < 100) {
			System.out.println("Man respect");
		}
	}
}
