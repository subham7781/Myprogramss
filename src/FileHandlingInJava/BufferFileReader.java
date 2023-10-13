package FileHandlingInJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

public class BufferFileReader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D://files_concept//E.txt");
			BufferedReader br = new BufferedReader(fr);
			
			for (int i = 0; i <4; i++) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
