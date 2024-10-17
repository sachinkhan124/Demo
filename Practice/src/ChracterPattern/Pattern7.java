package ChracterPattern;

public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			char ch='A';
//			for(int j=7-i;j>=1;j--)
//			{
//			    System.out.print(" ");	
//			}
			for(int j=i;j>=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}


//          A 
//         B A 
//        C B A 
//       D C B A 
//      E D C B A 
//     F E D C B A 
//    G F E D C B A 