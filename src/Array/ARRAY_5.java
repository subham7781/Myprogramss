package Array;

public class ARRAY_5 {
	public static void main(String[] args) {
		int[] x = { 5, 4, 3, 2, 1 };
		int temp;
		for (int j = 0; j < x.length; j++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] > x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i] = x[i + 1];
					x[i + 1] = temp;

				}
			}

		}
		for (int i : x) {
			System.out.println(i);
		}
	}

}
