package Smart_programing;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		int temp=0;
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter your Number");
		int no =scan.nextInt();
		for (int i = 2; i <=no-1; i++) {
			if (no%i==0) {
				temp=temp+1;
			}
		}
		if (temp==0) {
			System.out.println(no+" is a prime Number");
		}else {
			System.out.println(no+" is a not prime Number");
		}
	}
}
