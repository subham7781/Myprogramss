package Serialization_and_deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class B {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D://file.ser");
			A a1 = new A();
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a1);
			
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
