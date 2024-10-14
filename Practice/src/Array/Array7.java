package Array;

public class Array7 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)  //outer loop   
		{
			for(int j=5;j>=i;j--)   //inner loop
			{
				System.out.print(j+" ");  //prints the number in decrement order
			}
			System.out.println();   //next line
		}

	}

}
