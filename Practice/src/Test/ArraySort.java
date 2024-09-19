package Test;

public class ArraySort {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		boolean result = ArraySort(arr);
		System.out.println("result:"+result);

	}

	private static boolean ArraySort(int[] arr) {
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i] < arr[i-1])
			{
				return true;
			}
		}
		return false;
	}

	

}
