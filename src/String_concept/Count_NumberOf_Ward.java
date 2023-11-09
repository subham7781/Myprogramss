package String_concept;

public class Count_NumberOf_Ward {
	public static void main(String[] args) {
		String str = "  pankaj sir accademy test kanha    ";
		String[] s = str.trim().split(" ");
		System.out.println(s.length);
		for (String x : s) {
			System.out.println(x);
		}
		
	}
}
