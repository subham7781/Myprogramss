package String_concept;

final public class A {
	private final int age;
	private final String name;
	private char[] getname;
	
	public A(int age,String name) {
		this.age=age;
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public static void main(String[] args) {
		A a1 = new A(20,"kanha");
		System.out.println(a1.getname());
		System.out.println(a1.getage());
	}
	
}
