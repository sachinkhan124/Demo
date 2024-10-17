package ChracterPattern;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			char ch='A';
			for(int j=7-i;j>=1;j--)  //inner loop nd printing the space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");//printing the character
				ch++;
			}
			System.out.println();
		}

	}

}


//         A 
//        A B 
//       A B C 
//      A B C D 
//     A B C D E 
//    A B C D E F 
//   A B C D E F G