package throwsException;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class B {
	public static void main(String[] args) throws IOException, SQLException {
		FileWriter fw = new FileWriter("D://text.txt");
		DriverManager.getConnection("","","");
	}
}
