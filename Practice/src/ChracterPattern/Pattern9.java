package ChracterPattern;

public class Pattern9 {

	public static void main(String[] args) {
		//upper part
		for(int i=7;i>=1;i--)  //iterate each row 
		{
			char ch ='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");  //printing the char
				ch++;
			}
			System.out.println();
		}
		//lower part
		for(int i=2;i<=7;i++)
		{
			char ch ='A';
          for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}


///A B C D E F G 
//A B C D E F 
//A B C D E 
//A B C D 
//A B C 
//A B 
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F 
//A B C D E F G 
