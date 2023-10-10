package FileHandlingInJava;

import java.io.File;

public class CreatFolder {
	public static void main(String[] args) {
		File f = new File("D:files_concept//p1");
		boolean val = f.mkdir();
		System.out.println(val);
	}
}
