package String_concept;

final public class Comparing {
	public static void main(String[] args) {
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
	}
}
