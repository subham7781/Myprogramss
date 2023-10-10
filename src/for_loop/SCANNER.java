package for_loop;

import java.util.Scanner;

public class SCANNER {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Fullname");
		String name =scan.next();
		System.out.println("The output is:"+name);
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("The output is:"+age);
		
		System.out.println("Enter your weight");
		float weight =scan.nextFloat();
		System.out.println("The output id:"+weight);
		
		System.out.println("Entwr your ans");
		boolean ans =scan.nextBoolean();
		System.out.println("The output is :"+ans);
		
		System.out.println("Enter your phoneNumber");
		long phoneNumber =scan.nextLong();
		System.out.println("The output is:"+phoneNumber);
	}
}
