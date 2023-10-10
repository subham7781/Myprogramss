package While_loop;

public class Labeled_break {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			x:if(i==5) {
				break x;
			}
			System.out.println(i);
		}
	}
}
