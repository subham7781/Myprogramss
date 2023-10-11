package FileHandlingInJava;

import java.io.File;
import java.io.FileReader;

public class FullFileReader2 {
	public static void main(String[] args) {
		try {
			File f = new File("D://files_concept//A.txt");
			FileReader fr = new FileReader(f);
			
			char[] ch = new char[(int)f.length()];
			fr.read(ch);
			
			for (char c : ch) {
				System.out.print(c);
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
