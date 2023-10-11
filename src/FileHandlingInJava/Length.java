package FileHandlingInJava;

import java.io.File;

public class Length {
	public static void main(String[] args) {
		File f = new File("D://files_concept//A.txt");
		long val = f.length();
		System.out.println(val);
	}
}
