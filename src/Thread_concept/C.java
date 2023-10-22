package Thread_concept;

public class C extends Thread {
	String name;
	C(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i <1000; i++) {
			System.out.println(this.name);
		}
	}
}
