package Array;

public class Array13 {

	public static void main(String[] args) {
		//loop iterate each row
		for(int i=1;i<=5;i++)
		{
			//loop iterate each column
			for(int j=1 ;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}

	}

}


//1 
//1 0 
//1 0 1 
//1 0 1 0 
//1 0 1 0 1 