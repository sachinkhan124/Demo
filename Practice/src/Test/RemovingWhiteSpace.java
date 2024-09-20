package Test;

public class RemovingWhiteSpace {

	public static void main(String[] args) {
	  String str = "Hello world";
	  String str1 = removeWhiteSpace(str);
       System.out.println("String:"+str1);
	}

	private static String removeWhiteSpace(String str) {
		StringBuilder sb = new StringBuilder();
		char [] s = str.toCharArray();
		for(char c : s)
		{
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
			
		}
		return sb.toString();
	}

}
