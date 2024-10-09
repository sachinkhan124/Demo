package Array;

public class Findpair {

	public static void main(String[] args) {
		int [] arr = {2,4,7,8,10};
		int num =12;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(sum==num)
				{
					System.out.println("Element"+"["+arr[i]+" , "+arr[j]+"] ");
					System.out.println("Index"+"["+i+" , "+j+"] ");
				}
			}
		}
             
	}

}
