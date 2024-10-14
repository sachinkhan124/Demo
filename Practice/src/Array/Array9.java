package Array;

public class Array9 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			int counter = i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter+" ");
			  counter=counter+5-j;
			}
			System.out.println();
		}

	}

}
