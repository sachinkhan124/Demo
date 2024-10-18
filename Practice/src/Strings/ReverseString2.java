package Strings;

public class ReverseString2 {

	public static void main(String[] args) {
		String str ="deepak";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)   //iterate loop in revverse direction
		{
			rev=rev+str.charAt(i);   //check string position
		}
        System.out.println(rev);
	}

}
