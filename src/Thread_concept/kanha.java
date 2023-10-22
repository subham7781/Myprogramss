package Thread_concept;

public class kanha implements Runnable {//Runnable
	String name;

	kanha(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.name);
		}
	}

	public static void main(String[] args) {
		kanha a1 = new kanha("ggg");
		Thread t1 = new Thread(a1);
		t1.start();
		kanha a2 = new kanha("oooo");
		Thread t2 = new Thread(a2);
		t2.start();
		kanha a3 = new kanha("aaa");
		Thread t3 = new Thread(a3);
		t3.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main");
		}

	}
}
