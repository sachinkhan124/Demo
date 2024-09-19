package abstractdemo;

@FunctionalInterface
public interface MyFunctionalInterface {

	void abstractmethod();
	
	default void Defaultmethod()
	{
		System.out.println("this is default method in functional interface");
	}
	
	static void Staticmethod()
	{
		System.out.println("this is static method in functional interface");
	}
}
