package abstractdemo;

public class MyInterfaceClass implements MyInterface {
       
	
	
	
	public static void main(String[] args) {
     MyInterfaceClass interfaceClass = new MyInterfaceClass();
     interfaceClass.Defaultmethod();
     interfaceClass.abstractmethod();
     

	}

	@Override
	public void abstractmethod() {
		
		System.out.println("abstract method using interface");
		
	}


	

}
