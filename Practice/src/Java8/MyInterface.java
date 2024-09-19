package Java8;

@FunctionalInterface
public interface MyInterface {

    abstract void doSomething();
    
 
    default void defaultMethod()
    {
    	System.out.println("this is default method");
    }
    
    static void staticMethod()
    {
    	System.out.println("this is static method");
    }
}
