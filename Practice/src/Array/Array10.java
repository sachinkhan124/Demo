package Array;

public class Array10 {

	public static void main(String[] args) {
		//iterate loop each row
		for(int i=1;i<=5;i++)   //outer loop
		{
			for(int j=1;j<=i;j++)  //inner loop
			{
				System.out.print(j+" ");  // prints the number
			}
			for(int j=i-1;j>=1;j--)   
			{
				System.out.print(j+" ");
			}
			
			System.out.println();    //next line
		}

	}

}


//1 
//1 2 1 
//1 2 3 2 1 
//1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 

