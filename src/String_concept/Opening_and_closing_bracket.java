package String_concept;

import java.util.Iterator;
import java.util.Scanner;

public class Opening_and_closing_bracket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your bracket--()");
		 String str =scan.next();
		 int count1 =0;
		 int count2 =0;
		 for (int i = 0; i < str.length(); i++) {
			 if (str.charAt(i)=='(') {
				count1++;
			}else if (str.charAt(i)==')') {
				count2++;
			}
		}
		 if (count1==count2) {
			System.out.println("no error");
		}else {
			System.out.println("error");
		}
	}
}
