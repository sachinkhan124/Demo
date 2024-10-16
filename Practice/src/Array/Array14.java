package Array;

public class Array14 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)   //iterate each row
		{
			for(int j=7;j>=i;j--)   //iterate each column
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}


//7 6 5 4 3 2 1
//7 6 5 4 3 2
//7 6 5 4 3
//7 6 5 4
//7 6 5
//7 6
//7