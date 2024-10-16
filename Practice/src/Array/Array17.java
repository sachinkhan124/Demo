package Array;

public class Array17 {

	public static void main(String[] args) {
		//upper part
		for(int i=1;i<=7;i++)       //iterate each row 
		{
			for(int j=1;j<=i;j++)    //iterate each column
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
	}
		   //sub part
			for(int i=7-1;i>=1;i--)     //iterate each row
			{
				for(int j=1;j<=i;j++)    //iterate each column
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

	

}


//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1