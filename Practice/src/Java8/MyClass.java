package Java8;

public class MyClass implements MyInterface {

	@Override
	public void doSomething() {
		
		System.out.println("doing something");
		
	}
	
	
	@Override
	public void defaultMethod()
	{
		System.out.println("overriden default method");
	}
	

}
