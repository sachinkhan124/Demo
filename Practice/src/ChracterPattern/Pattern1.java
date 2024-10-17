package ChracterPattern;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)  //outer loop
		{
			char ch='Z';
			for(int j=1;j<=i;j++)   //iterate each row 
			{
				System.out.print(ch+" ");   //prints the character nd decrement the char
				ch--;
			}
			System.out.println();
		}

	}

}

//Z 
//Z Y 
//Z Y X 
//Z Y X W 
//Z Y X W V 
//Z Y X W V U 
//Z Y X W V U T 