package for_loop;

import java.util.Scanner;

public class Pincode_use {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("enter your pasword");
			int pasword = scan.nextInt();
			if(pasword==8520) {
				System.out.println("Welcome");
				break;
			}
			else {
				System.out.println("Inveliv pasword");
			}
			if(i==4) {
				System.out.println("Phone is Locked");
			}
		}
	}
}
