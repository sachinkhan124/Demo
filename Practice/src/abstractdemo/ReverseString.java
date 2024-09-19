package abstractdemo;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "abc";
		System.out.println(reverse(str));
  
		}

	private static String reverse(String str) {
	if(str == null)
	{
		throw new IllegalArgumentException("str is not valid");
	}
	   StringBuilder sb = new StringBuilder();
	   char [] arr = str.toCharArray();
	   for(int i=arr.length-1 ;i>=0;i--)
	   {
		   sb.append(arr[i]);
	   }
		return sb.toString();
	}

}