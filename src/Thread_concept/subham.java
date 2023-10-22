package Thread_concept;

public class subham extends Thread {//Thread life cycle
	public static void main(String[] args) {
		subham a1 = new subham();
		System.out.println(a1.getState());
		a1.start();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(a1.getState());
	}
	public void run() {
		System.out.println("text");
	}
}
