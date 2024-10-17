package ChracterPattern;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=7;i>=1;i--)  //outer loop nd iterate each loop 
		{
			char ch ='p';
			for(int j=1;j<=i;j++)   // inner loop  
			{
				System.out.print(ch+" ");//prints the char p to v
				ch++;
			}
			System.out.println();
		}

	}

}


//p q r s t u v 
//p q r s t u 
//p q r s t 
//p q r s 
//p q r 
//p q 
//p 