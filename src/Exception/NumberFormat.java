package Exception;

public class NumberFormat {
	public static void main(String[] args) {
		try {
			String x = "abc123";

			int x1 = Integer.parseInt(x);
			System.out.println(x1);

			float x2 = Float.parseFloat(x);
			System.out.println(x2);

			long x3 = Long.parseLong(x);
			System.out.println(x3);

			double x4 = Double.parseDouble(x);
			System.out.println(x4);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("WELCOME");

	}
}
