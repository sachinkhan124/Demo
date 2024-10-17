package ChracterPattern;

public class Pattern10 {

	public static void main(String[] args) {
		
		char ch ;
		for(int i=7;i>=1;i--)   //iterate each row with decrement order
		{
			ch='A';
			for(int j=2*7-i;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		for(int i=2;i<=7;i++)     // iterate each row nd increment
		{
			ch='A';
			for(int j=2*7-i;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}


// A B C D E F G 
//   A B C D E F 
//     A B C D E 
//       A B C D 
//         A B C 
//           A B 
//             A 
//           A B 
//         A B C 
//       A B C D 
//     A B C D E 
//   A B C D E F 
// A B C D E F G 