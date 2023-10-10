package Exception;

public class Arithmetic {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x / y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(100);
	}

}
