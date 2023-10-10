package Exception;

public class Nullpointer {
	int x =10;
	public static void main(String[] args) {
		try {
			Nullpointer a1 =null;
			System.out.println(a1.x);
			System.out.println(10);// not work
			
		} catch (NullPointerException e) {
			e.printStackTrace();

		}
		System.out.println(100);
	}
}
