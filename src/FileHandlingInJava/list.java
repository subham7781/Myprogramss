package FileHandlingInJava;

import java.io.File;

public class list {
	public static void main(String[] args) {
		File f = new File("D://files_concept//");
		String[] names = f.list();
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(names.length);
	}
}
