package Test;

public class ConvertIntToString {

	public static void main(String[] args) {
		int num = 123;
		String str = ConvertInttoString(num);
		System.out.println("String:"+str);

	}

	private static String ConvertInttoString(int num) {
		
		return String.valueOf(num).toString();
	}

}
