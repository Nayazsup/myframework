package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetch_data {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/onlydata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		
		
	}
}
