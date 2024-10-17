package ChracterPattern;

public class pattern11 {

	public static void main(String[] args) {
		char ch;
		for(int i=1;i<=7;i++)    //iterate each row nd increment order 
		{
			ch='A';
			for(int j=1;j<=7-i;j++)   //leading spaces
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)    //printing the character
			{
				System.out.print(ch+" "); 
				ch++;
			}
			System.out.println();
		}
		
		for(int i=7-1;i>=1;i--)    //iterate each row in decrement order
		{
			ch='A';
			for(int j=1;j<=7-i;j++)  //leading spaces
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)      // printing the char
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}



//            A 
//           A B 
//          A B C 
//         A B C D 
//        A B C D E 
//       A B C D E F 
//      A B C D E F G 
//       A B C D E F 
//        A B C D E 
//         A B C D 
//          A B C 
//           A B 
//            A 