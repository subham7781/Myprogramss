package Thread_concept;

public class kkk extends Thread {
	 String name;
	kkk(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		 kkk a1 = new kkk("xxx");
		 kkk a2 = new kkk("zzz");
		 a1.setPriority(5);  
		 a2.setPriority(10);
		 System.out.println(a1.getPriority());
		 System.out.println(a2.getPriority());
		 a1.start();
		 a2.start();
	}
	public void run () {
		System.out.println(this.name);
	}
}
