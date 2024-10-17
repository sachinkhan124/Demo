package Array;

public class Array25 {

	public static void main(String[] args) {
	
		for(int i=1;i<=6;i++)
		{
			for(int j=i;j<=6-1;j++)   //iterate each row  prints with space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)     //iterate each row prints with number
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}


//      1 
//     1 2 
//    1 2 3 
//   1 2 3 4 
//  1 2 3 4 5 
// 1 2 3 4 5 6 
 
