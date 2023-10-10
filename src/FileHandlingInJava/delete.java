package FileHandlingInJava;

import java.io.File;

public class delete {
	public static void main(String[] args) {
		File f = new File("D://files_concept//B.txt");
		boolean val = f.delete();
		System.out.println(val);
	}
}
