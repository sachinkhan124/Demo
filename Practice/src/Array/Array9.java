package Array;

public class Array9 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)  //outer loop
		{
			int counter = i;
			for(int j=1;j<=i;j++)  //inner loop
			{
				System.out.print(counter+" ");  //prints the count
			  counter=counter+5-j;
			}
			System.out.println();
		}

	}

}
