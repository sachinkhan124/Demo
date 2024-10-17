package ChracterPattern;

public class Pattern8 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{   
			//print leading spaces
			for(int j=7-i-1;j>0;j--) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)  //inner loop iterate each loop 
			{
				System.out.print((char)('Z'-i+j)+" ");
			}
			System.out.println();
		}
	}

}


//       Z 
//      Y Z 
//     X Y Z 
//    W X Y Z 
//   V W X Y Z 
//  U V W X Y Z 
// T U V W X Y Z 