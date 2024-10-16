package Array;

public class Array21 {

	public static void main(String[] args) {
		int k=7;
		for(int i=1;i<=7;i++)         //outer loop
		{
			for(int j=1;j<i*2;j++) {     //rotate inner loop 
				System.out.print(" ");    //prints the space
			}
		
			for(int j=1;j<=k;j++)      //inner loop
			{
				System.out.print(j+" ");
			}
			k--;
			System.out.println();
		}

	}

}



//  1 2 3 4 5 6 7 
//    1 2 3 4 5 6 
//      1 2 3 4 5 
//        1 2 3 4 
//          1 2 3 
//            1 2 
//              1 
