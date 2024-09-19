package demo;

import java.util.function.Consumer;

public class MethodReferenceWithParticularObject {
	
	public  void printMessage(String message)
	{
		System.out.println(message);
	}

	public static void main(String[] args) {
      
		MethodReferenceWithParticularObject example  = new MethodReferenceWithParticularObject();
		
		Consumer<String> printLambda = message -> example.printMessage(message);
		  //instance::instanceMethodName
		Consumer<String> printMethodRef = example::printMessage;
		
	    printLambda.accept("print lambda");
	    printMethodRef.accept("print methodRef");

	}

}
