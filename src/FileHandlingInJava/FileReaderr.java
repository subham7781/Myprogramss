package FileHandlingInJava;

import java.io.FileReader;

public class FileReaderr {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D://files_concept//A.txt");
			for (int i = 0; i <4; i++) {
				System.out.print((char)fr.read());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
