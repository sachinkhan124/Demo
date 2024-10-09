package Test;

public class MaxNo {

	public static void main(String[] args) {
		int [] number= {2,36,8,23};
		int max = number[0];
		int min = number[0];
		for(int n :number)
		{
			if(n>max)
			{
				max=n;
			}
			if(n<min)
			{
				min=n;
			}
		}
		System.out.println("maximum:"+max);
		System.out.println("minimum:"+min);

	}

}
