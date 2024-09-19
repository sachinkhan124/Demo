package abstractdemo;

public class StringpoolExample {

	public static void main(String[] args) {
     
		String str1 = "Hello";
		String str2 ="Hello";
		
		String s3 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == s3);
		
		String s4 = s3.intern();
		
		 String result=s3.concat("java");
		 System.out.println(result);
		
		System.out.println(str1 == s4);
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		
		System.out.println(sb);
		
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("hello");
		System.out.println(sbuffer);

	}

}
