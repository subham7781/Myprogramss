package Thread_concept;

public class setName extends Thread {
	String name;
	setName(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		setName a1 = new setName("kanha");
		setName a2 = new setName("subham");
		a1.setName("AddAmount");
		a2.setName("amount");
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		a1.start();
		a2.start();
	}
	public void run() {
		System.out.println(this.name);
	}
}
