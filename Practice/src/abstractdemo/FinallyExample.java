package abstractdemo;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyExample {
	  
	public static void main(String[] args) throws IOException {
	        FileWriter fileWriter = null;
	        try{
	        	fileWriter = new FileWriter("example4.txt");
	            fileWriter.write("Hello, world!");
                System.out.println("data inserted");

	        } catch (Exception e) {
	            System.out.println("An IOException occurred: " + e.getMessage());
	        } 
	        finally {
	
	                if (fileWriter != null) {
	                    fileWriter.close();
	                    System.out.println("file writer closed");
	                }
	        }
	    }
}

	

