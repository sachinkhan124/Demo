package Array;

public class Array12 {

	public static void main(String[] args) {
	 for(int i=1;i<=5;i++)    //Loop to iterate over each row
	 {
		 for(int j=i;j<=5;j++)   //Loop to iterate over each column
		 {
			 System.out.print(j+" ");
		 }
		 
		 for(int j=1;j<i;j++)  //loop to iterate  over each column
		 {
			 System.out.print(j+" ");
		 }
		 System.out.println();
	 }

	}

}


//1 2 3 4 5 
//2 3 4 5 1 
//3 4 5 1 2 
//4 5 1 2 3 
//5 1 2 3 4 