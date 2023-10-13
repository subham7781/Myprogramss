package FileHandlingInJava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferedwriter {
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("D://files_concept//E.txt");
			BufferedWriter bf = new BufferedWriter(fr);
			bf.write("100");
			bf.newLine();
			bf.write("kanha");
			bf.newLine();
			char[] ch = {'a','b','c'};
			bf.write(ch);
			
			bf.close();
			bf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
