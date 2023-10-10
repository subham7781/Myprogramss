package Array;

public class ARRAY_2 {
	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		for (int i : x) {// using foreach
			System.out.println(i);// 10,20,30,0,0
		}
	}
}