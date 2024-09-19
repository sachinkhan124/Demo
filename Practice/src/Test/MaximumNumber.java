package Test;

public class MaximumNumber {

	public static void main(String[] args) {
		int [] arr = {2,5,3,6,237,8,4};
		int result =maximumNumber(arr);
		System.out.println("maximumNumber:"+result);
}

	private static int maximumNumber(int[] arr) {
	 if(arr.length==0)
	 {
		 throw new IllegalArgumentException("value cannot be null");
	 }
	 int max =arr[0];
	 for(int i=0;i<arr[i];i++)
	 {
		 
		 if(arr[i] > max)
		 {
			 max =arr[i];
		 }
	 }
		return max;
	}

	
}