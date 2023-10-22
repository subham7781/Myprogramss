package Thread_concept;

public class D {
	public static void main(String[] args) {
		C a1 = new C("xxx");
		C a2 = new C("yyy");
		C a3 = new C("zzz");
		a1.start();
		a2.start();
		a3.start();
	}
}
