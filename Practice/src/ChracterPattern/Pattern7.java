package ChracterPattern;

public class Pattern7 {

	public static void main(String[] args) {
		
	        int n = 7; // Number of rows

	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = n - i; j > 0; j--) {
	                System.out.print(" ");
	            }

	            // Print characters in reverse order
	            for (int j = i; j >= 1; j--) {
	                System.out.print((char) ('A' + j - 1) + " ");
	            }
	            
	            System.out.println(); // Move to the next line after each row
	        }
	}
}

//          A 
//         B A 
//        C B A 
//       D C B A 
//      E D C B A 
//     F E D C B A 
//    G F E D C B A 