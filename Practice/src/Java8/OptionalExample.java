package Java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
    Optional<String> optional = Optional.ofNullable(getValue());
    
       optional.ifPresent(System.out::println);
       
       String value = optional.orElse("default value");
       
       System.out.println(value);

	}
     
	
	private static  String getValue()
	{
		return null;
	}
}
