package demo;

	public class MyClass {
	    
	   static int staticCounter ;
	   
	   int instanceCounter = 1;
	   
	   public static void incrementStaticCounter()
	   {
		   staticCounter++;
		   //System.out.println(instanceCounter);
		   System.out.println("Static Counter"+staticCounter);
	   }
	   
	   public void incrementInstanceCounter()
	   {
		   instanceCounter++;
		   System.out.println("InstanceCounter"+instanceCounter);
	   }
	   
	   public static void main(String [] args)
	   {
		   MyClass.incrementStaticCounter();
		   MyClass.incrementStaticCounter();
		   
		   MyClass obj1 = new MyClass();
		   MyClass obj2 = new MyClass();
		   obj1.incrementInstanceCounter();
		   obj2.incrementInstanceCounter();
		   obj1.incrementInstanceCounter();
		   
		   obj1.incrementStaticCounter();
		   
	   }
	}


