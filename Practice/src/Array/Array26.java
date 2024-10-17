package Array;

public class Array26 {

	public static void main(String[] args)
	{
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<7-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<2*i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}



//     1 
//    2 3 
//   3 4 5 
//  4 5 6 7 
// 5 6 7 8 9 