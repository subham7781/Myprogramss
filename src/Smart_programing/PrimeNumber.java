package Smart_programing;

public class PrimeNumber {
	public static void main(String[] args) {
		int x = 8;
		int temp=0;
		for (int i = 2; i <=x-1; i++) {
			if (x%i==0) {
				temp=temp+1;
			}
		}
		if (temp==0) {
			System.out.println(x+" is a prime number");
		}else {
			System.out.println(x+" is a not a primwe number");
		}
	}
}
