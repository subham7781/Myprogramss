package Myproject;

import java.util.Scanner;

public class Project1 {
	public static void main(String[] args) {
		String x = "yes";
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your pasword");
			int pasword = scan.nextInt();
			if (pasword == 8798)

				while (x.equals("yes")) {
					{
						System.out.println("Enter your username");
						String username = scan.next("ka8ha");
						System.out.println("The out put is:" + username);
						System.out.println("Enter your Amount");
						int Amount = scan.nextInt();
						System.out.println("collect your Rs." + Amount);
						System.out.println("Do you want to continue(yes/no)");
						x = scan.next();
						System.out.println("thank you");
					}
				}
			else {
				System.out.println("Invalid pasword");
			}
			if (i == 2) {
				System.out.println("Account is locked");
			} else {
				break;
			}
		}
	}
}
