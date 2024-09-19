package demo;

public class StaticBlockExample {
	
	  static int count;
	  static String message;
	  
	  static {
		   count =10;
		  message="hello world";
		  System.out.println("static block excuted");
	  }

	public static void main(String[] args) {
       
	    System.out.println("count:"+count);
	    System.out.println("message:"+message);

	}

}
