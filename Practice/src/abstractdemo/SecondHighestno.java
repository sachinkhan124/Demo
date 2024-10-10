package abstractdemo;

public class SecondHighestno {

	public static void main(String[] args) {

	int []arr= {2,3,7,8};
	int max=Integer.MIN_VALUE;
	int second_max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			second_max=max;
			max=arr[i];
		}
		else if(arr[i]>second_max && arr[i]!=max)
		
		{
			second_max=arr[i];
		}
	}
		System.out.println(second_max);
    }
	}
	

	


