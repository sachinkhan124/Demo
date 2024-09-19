package demo;

public class InstanceofExample {

	public static void main(String[] args) {
       Object obj = new Integer(42);
    
       if(obj instanceof Integer)
       {
    	   //String str = (String)obj;
    	   Integer num = (Integer)obj;
    	   System.out.println(num);
       }
       else
       {
    	   System.out.println("The object isnot Instance of String");
       }
		//implict casting    widening
		
//		int num =10;
//		long longnum = num;
//		System.out.println(longnum);
//		
//		//narrowing
//		double num1 = 9.78;
//		int num2 =(int)num1;
//		System.out.println(num2);
//		
		
		
	}

}
