package Test;
import java.util.Arrays;

public class ArrayReverser {
  
	
		
	
  
 public static void main(String[]args)
 {
	 int array []= {1,2,3,4,5};
	 System.out.println("Before reversing array:"+Arrays.toString(array));
	   reverseArray(array);
	 System.out.println("After reversing array:"+Arrays.toString(array));
	 
 }

   private static void reverseArray(int[] array) {
	int left =0;
	int right =array.length-1;
	int temp;
	while(left<right)
	{
		 temp = array[left];
		 array[left]=array[right];
		 array[right]=temp;
		 left++;
		 right--;
	}
	
   }


  
	
}

