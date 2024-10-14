package Array;

public class Array5 {

	public static void main(String[] args) {
		for(int i=1 ;i<=5;i++)//outer loop, row=5
		{
			for(int j=5;j>=i;j--) //inner loop nd print the space in decrement order
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) //print the number 
			{
				System.out.print(i+" ");
			}
			System.out.println();  //next line
		}
      

		
		
		
		
	}
   

	
}
