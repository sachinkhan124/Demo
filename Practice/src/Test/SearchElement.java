package Test;

public class SearchElement {

	public static void main(String[] args) {
		int [] arr = {2,3,5,6,7,8,5};
		int target=6;
		boolean result = searchElement(arr,target);
		System.out.println("Result:"+result);

	}

	private static boolean searchElement(int[] arr, int target) {
		for(int num : arr)
		{
			if(num==target)
			{
				return true;
			}
		}
		return false;
	}

	
}
