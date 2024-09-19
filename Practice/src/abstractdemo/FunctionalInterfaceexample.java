package abstractdemo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceexample {
	
	
	public static void main(String[] args) {
	 MyFunctionalInterface functionalInterface = ()-> System.out.println("abstract method implementation using lamdda");
	 
	 functionalInterface.abstractmethod();
	 functionalInterface.Defaultmethod();
	 MyFunctionalInterface.Staticmethod();
	 
	 System.out.println("--------------------------------------------------------");
	 
	 Predicate<String> longThan5 = s -> s.length() > 5;
	 
	 System.out.println(longThan5.test("hello"));
	 
     System.out.println(longThan5.test("hello world"));
	 
	 System.out.println("-----------------------------------------------------------------");
	 
	 Function<String, Integer> stringlength = s -> s.length();
	 
	  System.out.println(stringlength.apply("Hello"));
	  System.out.println(stringlength.apply("hello world"));
	 
	  System.out.println("-------------------------------------------------");
	  Consumer<String> print = s -> System.out.println(s);
	  print.accept("hello");
	  print.accept("hello world");

	}

}
