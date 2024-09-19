package demo;

import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
      Function<String, Object> parseIntlambda = s-> Integer.parseInt(s);
      // ClassName::staticMethodName
      Function<String, Object> parseIntMethRef = Integer::parseInt;
      System.out.println(parseIntlambda.apply("123"));
      System.out.println(parseIntMethRef.apply("123"));
     
	}

}
