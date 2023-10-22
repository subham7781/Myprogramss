package Thread_concept;

public class AAA {
	int balance = 0;

	public static void main(String[] args) {
		AAA a1 = new AAA();
		a1.account();
		System.out.println(a1.balance);
	}

	private void account() {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				add();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				sub();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public synchronized void add() {
		for (int i = 0; i < 100; i++) {
			balance = balance + i;
		}
	}

	public synchronized void sub() {
		for (int i = 0; i < 100; i++) {
			balance = balance - i;
		}
	}
}
