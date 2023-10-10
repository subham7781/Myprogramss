package Smart_programing;

public class largerNumber3 {
	public static void main(String[] args) {// find 3 type larger Number
		int a = 6652;
		int b = 6563;
		int c = 6565;
		if (a > b) {
			if (a > c) {
				if (b > a) {
					if (b > c) {
						if (c > a) {
							if (c > b) {
								System.out.println("c is grater");
							} else {
								System.out.println("b is grater");
							}
						} else {
							System.out.println("a is grater");
						}
					} else {
						System.out.println("c is grater");
					}
				} else {
					System.out.println("a is grater");
				}
			} else {
				System.out.println("c is grater");
			}
		} else {
			System.out.println("b is grater");
		}
	}
}
