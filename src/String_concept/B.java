package String_concept;

final public class B {//immuatable
	private final int age;
	private final String name;
	private final char group;
	private final double number;
	
	public B(int age , String name , char group , double number) {
		 this.age = age;
		 this.name = name;
		 this.group = group;
		 this.number = number;
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public char getgroup() {
		return group;
	}
	public double getnumber() {
		return number;
	}
	public static void main(String[] args) {
		B b1 = new B(20,"kanha",'A',4.5);
		System.out.println(b1.getage());
		System.out.println(b1.getname());
		System.out.println(b1.getgroup());
		System.out.println(b1.getnumber());
	}
	
}
