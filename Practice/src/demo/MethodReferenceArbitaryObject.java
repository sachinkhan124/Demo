package demo;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceArbitaryObject {

	public static void main(String[] args) {
      
		List<String> strings =Arrays.asList("a","b","c");
		
		strings.forEach(s -> System.out.println(s));
		strings.forEach(System.out :: println);

	}

}
