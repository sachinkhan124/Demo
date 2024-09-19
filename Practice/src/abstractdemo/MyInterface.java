package abstractdemo;

public interface MyInterface {
	
	default void Defaultmethod()
	{
		System.out.println("this is default method interface");
	}
	
	void abstractmethod();

}
