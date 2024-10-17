package Array;

public class Array24 {

	public static void main(String[] args) {
		//upper part
	for(int i=1;i<=7;i++)        //outer loop
	{
		for(int j=1;j<i;j++)     // iterate each row  begining with space
		{
			System.out.print(" ");
	}
		for(int j=i;j<=7;j++)    //iterate each row 
		{
			System.out.print(j);
		}
		
		System.out.println();
	}
	//   sub part
        for(int i=7-1;i>=1;i--)
        {
        	for(int j=1;j<i;j++)
        	{		
           System.out.print(" ");
        	}
        	for(int j=i;j<=7;j++)
        	{
        		System.out.print(j);
        	}
        	System.out.println();
        }
	}

}


//1234567
// 234567
//  34567
//   4567
//    567
//     67
//      7
//     67
//    567
//   4567
//  34567
// 234567
//1234567