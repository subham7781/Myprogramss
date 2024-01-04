package throwsException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
   int blance = 500;
   
   Scanner s = new Scanner(System.in);
	System.out.println("Enter your amount");
	int amount=s.nextInt();
	if (blance>amount) {
		System.out.println("please collect the cash");
	} else {
		try {
         throw new InSufficientFunds();
		}catch(InSufficientFunds e) {
			System.out.println(e);
			System.out.println("low balance!!");
		}
	}
      
	}
}
