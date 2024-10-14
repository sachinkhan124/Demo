package Array;

public class Array6 {

	public static void main(String[] args) {
	 for(int i=1;i<=5;i++)  //outer loop row=5
	 {
		 for(int j=1;j<=i;j++)  //inner loop print the space
		 {
			 System.out.print(j+" ");
		 }
		 System.out.println();
	 }
	 for(int i=4;i>=1;i--)    //print the reverse order nd row in specific condition
	 {
		 for(int j=1;j<=i;j++)      //inner loop
		 {
			 System.out.print(j+" ");  //prints the no in reverse order
		 }
		 System.out.println();     // next line
	 }

	}

}
