package Array;

public class Array8 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)  //outer loop decrement order 
		{
			for(int j=1;j<=i;j++)  //inner loop 
			{
				System.out.print(j+" ");   //print he space
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)     // inner loop nd start with 2 
		{
			for(int j=1;j<=i;j++)    //inner loop 
			{
				System.out.print(j+" ");  //prints the number specific condition
			}
			System.out.println();     //next line
		}

	}

}
