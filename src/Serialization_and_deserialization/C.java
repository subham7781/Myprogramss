package Serialization_and_deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class C {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D://file.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			A a1 = (A)ois.readObject();
			System.out.println(a1.name);
			System.out.println(a1.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
