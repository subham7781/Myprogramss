package FileHandlingInJava;

import java.io.File;

public class Exists {
	public static void main(String[] args) {
		File f = new File("D://files_concept//A.txt");
		boolean val = f.exists();
		System.out.println(val);
	}
}
