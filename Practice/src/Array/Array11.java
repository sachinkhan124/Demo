package Array;

public class Array11 {

	public static void main(String[] args) {
		//upper part
		for(int i=1;i<=5;i++)   //outer loop nd iterate each loop
		{
			for(int j=1;j<=i;j++) // iterate each loop with specific column
			{
				System.out.print(" ");  //prints the space
			}
			
			for(int j=i; j<=5;j++)     //iterate each Loop 
			{
				System.out.print(j+" "); //prints the number increment order
			}
			System.out.println();
		}
		//lower part
		for(int i=4;i>=1;i--)     //iterate each loop in decrement order
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");  //prints the space
			}
			
			for(int k=i;k<=5;k++)   
			{
				System.out.print(k+" ");  //prints the number
			}
			System.out.println();
		}
	}

}




//1 2 3 4 5 
//2 3 4 5 
// 3 4 5 
//  4 5 
//   5 
//  4 5 
// 3 4 5 
//2 3 4 5 
//1 2 3 4 5 
