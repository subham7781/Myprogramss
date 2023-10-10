package While_loop;

import java.util.Scanner;

public class While_Method {
	public static void main(String[] args) {
		String x ="yes";
		Scanner scan = new Scanner(System.in);
		
		while(x.equals("yes")) {
			System.out.println("Enter your Amount");
			int Amount =scan.nextInt();
			System.out.println("collect your rs"+Amount);
			System.out.println("Do you want to continue(yes/no)");
			x=scan.next();
			System.out.println("thank you vist again");
		}
	}
}
