package Array;

public class Array28 {

	public static void main(String[] args) {
		int num=1;
		for(int i=4;i>=1;i--) //outer  loop
		{
			for(int j=1;j<=i;j++)  //inner loop   iterate each row 
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}

//1 2 3 4
//5 6 7
//8 9
//10