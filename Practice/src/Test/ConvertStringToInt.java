package Test;

public class ConvertStringToInt {

	public static void main(String[] args) {
		String str = "123";
		int result = StringToInt(str);
		System.out.println("Integer:"+result);

	}

	private static int StringToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException ex)
		{
			throw new IllegalArgumentException("invalid Integer Format");
		}
		
		
	}

}
