package Array;

public class Array15 {

	public static void main(String[] args) {
		for(int i=7;i>=1;i--)   //iterate each row 
		{
			for(int j=i;j>=1;j--)   //iterate each column
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}


//7 6 5 4 3 2 1
//6 5 4 3 2 1
//5 4 3 2 1
//4 3 2 1
//3 2 1
//2 1
//1