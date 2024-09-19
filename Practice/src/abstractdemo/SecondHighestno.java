package abstractdemo;

public class SecondHighestno {

	public static void main(String[] args) {

		int [] arr = {1,2,3,6,2,4,7};
		int max  = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		for(int i=0 ;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				second_max = max;
				max =arr[i];
			}
			else if(arr[i] > second_max && arr[i]!= max)
			{
				second_max = arr[i];
				
			}
		}
       System.out.println("the Second Highest No:"+second_max);
		
		
    }
	}
	

	


