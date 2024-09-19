package demo;

public class AdvancedStaticBlockExample {
	
	 static int variable1;
	 static int variable2;
	 
	 static
	 {
		 variable1=10;
	 }
	 
	 static
	 {
		 variable2=20;
	 }
	public static void main(String[] args) {
     
		System.out.println("variable1:"+variable1);
		System.out.println("variable2:"+variable2);

	}

}
