package Nested_loop;

public class Nested {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			x:for (int j = 0; j < 5; j++) {
				System.out.println("welcome");
				break x;
			}
		}
	}
}
