package ChracterPattern;

public class Pattern4 {

	public static void main(String[] args) {
		for(int i=7;i>=1;i--)   //outer loop iterate each row
		{
			char ch='G';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}

	}

}

//G F E D C B A 
//G F E D C B 
//G F E D C 
//G F E D 
//G F E 
//G F 
//G 
