package ChracterPattern;

public class Pattern12 {

	public static void main(String[] args) {
		
		char ch ;
		for(int i=1;i<=7;i++)     //iterate each row 
		{
			ch ='A';
			for(int j=1;j<=i;j++)    //printing  the each ch 
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		for(int i=7-1;i>=1;i--)  
		{
			ch='A';
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
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F 
//A B C D E F G 
//A B C D E F 
//A B C D E 
//A B C D 
//A B C 
//A B 
//A 