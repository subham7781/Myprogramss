package FileHandlingInJava;

import java.io.FileWriter;

public class Filewriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D://files_concept//E.txt",true);
			fw.write("100");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
