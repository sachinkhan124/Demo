package ChracterPattern;

public class Pattern13 {

	public static void main(String[] args) {
		char ch;
	   for(int i=1;i<=7;i++)    //iterate each row A to G
	   {
		   ch='A';
		   for(int j=2*7-i;j>=i;j--)  //leading spaces
		   {
			   System.out.print(" ");
		   }
		   for(int j=i;j>=1;j--)
		   {
			   System.out.print(ch+" ");  //printing the character
			   ch++;
		   }
		   System.out.println();
	   }
	   
	   for(int i=7-1;i>=1;i--)        //iterate each row with decrement order
	   {
		   ch='A';
		   for(int j=2*7-i;j>=i;j--)   //leading the spaces
		   {
			   System.out.print(" ");
		   }
		   for(int j=i;j>=1;j--)          //printing the character
		   {
			   System.out.print(ch+" ");
			   ch++;
		   }
		   System.out.println();   //next line
	   }

}
}

//            A 
//          A B 
//        A B C 
//      A B C D 
//    A B C D E 
//  A B C D E F 
//A B C D E F G 
//  A B C D E F 
//    A B C D E 
//      A B C D 
//        A B C 
//          A B 
//            A 