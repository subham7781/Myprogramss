package FileHandlingInJava;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) {
		File f = new File("D://files_concept//B.txt");
		try {
			boolean val=f.createNewFile();
			System.out.println(val);
		} catch (IOException e) {
		   e.printStackTrace();
		}
	}
}
