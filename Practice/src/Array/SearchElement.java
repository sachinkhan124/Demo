package Array;

public class SearchElement {

	public static void main(String[] args) {
		int [] arr = {2,3,4,6,7};
		int target=4;
		boolean contains = false;
		for(int num :arr)
		{
			if(num==target)
			{
				contains =true;
				break;
			}
			
		}
		if(contains)
		{
			System.out.println("Array contains :"+target);
		}
		else
		{
			System.out.println("Array doesnot contains:"+target);
		}
	}

}
