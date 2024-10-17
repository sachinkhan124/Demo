package ChracterPattern;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}

	}

}

//A 
//B B 
//C C C 
//D D D D 
//E E E E E 
//F F F F F F 
//G G G G G G G 
