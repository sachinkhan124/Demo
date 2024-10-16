package Array;

public class Array23 {

	public static void main(String[] args) {
		for(int i=7;i>=1;i--)    //outer loop
		{
			for(int j=7*2-i;j>=i;j--)  //iterate  space begining
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) //Printing i to 1 value at the end of each row
			{
				System.out.print(j+" ");   
			}
			System.out.println();
		}

	}

}



//7 6 5 4 3 2 1 
//  6 5 4 3 2 1 
//    5 4 3 2 1 
//      4 3 2 1 
//        3 2 1 
//          2 1 
//            1 
