package defaultt;

import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much number you want to add?");
		int count = scanner.nextInt();
		int[] arr = new int[count];
		int soma = 0;
		int maior = 0;
		int menor = 0;
		int media = 0;
		for(int n = 0;n < count;n++) {
			System.out.println("Increase an number");
			int all = scanner.nextInt();
			arr[n] = all;
			soma+=arr[n];
			if(menor == 0 && maior == 0) {
				menor = arr[n];
				maior = arr[n];
			}
			else if(arr[n]< menor) {
				menor = arr[n];
			}
			else if(arr[n]>maior) {
				maior = arr[n];
			}
		
		}
		System.out.println("this array have "+arr.length+" values");
		System.out.println("increseing all numbers we have "+soma);
		System.out.println("the minor number is "+menor);
		System.out.println("The highest number in this range is "+maior);
		System.out.println("the measure is "+ media);

	}

}
