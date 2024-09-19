package Test;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=12345;
		int sum=0,temp;
		while(num>0)
		{
 			temp=num%10;//5 4  3 2 1 
			sum=sum+temp;//5 9 12 14 15
			num=num/10;//1234 123 12 1
			
		}
        System.out.println("Sum:"+sum);
	}

}
