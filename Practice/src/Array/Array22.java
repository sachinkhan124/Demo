package Array;

public class Array22 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			//printing the space begining of each row
			for(int j=7*2-i;j>=i;j--)
			{
				System.out.print(" ");
			}
			//Printing 1 to i value at the end of each row
			for(int j=i;j>=1;j--)
			{
			System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}





//           1
//         2 1
//       3 2 1
//     4 3 2 1