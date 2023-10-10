package Smart_programing;

public class AllPrimeNumber {
	public static void main(String[] args) {
		 int temp=0;
		 for (int no = 1; no <=100; no++) {
			for (int j = 2; j <=no-1; j++) {
				if (no%j==0) {
					temp=temp+1;
				}
			}
			if (temp==0) {
				System.out.println(no);
			}else {
				temp=0;
			}
		}
	}
}
