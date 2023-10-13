package FileHandlingInJava;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter2 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D://files_concept//E.txt");
			fw.write(97);
			fw.write("kanha");
			char[] ch = {'a','b','c'};
			fw.write(ch);
			fw.close();
			fw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
