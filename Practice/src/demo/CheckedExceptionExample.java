package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {
      
		try {
			FileReader file = new FileReader("somefile.txt");
		} catch (FileNotFoundException e) {
		    System.out.println("File Not Found Exception:"+e.getMessage());
		}
	}

	
	
}
