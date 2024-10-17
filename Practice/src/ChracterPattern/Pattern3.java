package ChracterPattern;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=7 ;i>=1;i--)
		{
			char ch ='A';
			for(int j=1;j<=i;j++)    //iterate each row and decrement the character
			{
				System.out.print(ch+" ");  //printing the charcter
				ch++;
			}
			System.out.println();
		}

	}

}


//A B C D E F G 
//A B C D E F 
//A B C D E 
//A B C D 
//A B C 
//A B 
//A 