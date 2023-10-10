package While_loop;

import java.util.Iterator;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i == 5) {
				System.out.println("OK");
				break;
			}
			System.out.println(i);
		}
	}
}
