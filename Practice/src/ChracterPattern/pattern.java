package ChracterPattern;

public class pattern {

	public static void main(String[] args) {
		
       for(int i=1;i<=5;i++)   // outer  loop
       {
    	   char ch='A';
    	   for(int j=1;j<=i;j++)   //inner loop
    	   {
    		   System.out.print(ch+" ");//prints the character
    		   ch++;
    	   }
    	   System.out.println();
       }
	}

}
