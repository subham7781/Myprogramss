package Smart_programing;

public class Leap_Year {
	public static void main(String[] args) {
		int kanha = 2000;
		if(kanha % 4==0) {
			if(kanha % 100==0) {
				System.out.println("this is leap year");
			}else {
				System.out.println("not leap year");
			}
		}else {
			System.out.println("not a leap year");
		}
	}
}
