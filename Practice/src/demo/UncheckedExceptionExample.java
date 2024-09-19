package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UncheckedExceptionExample {
	
//	public static void setAge(int age)
//	{
//		if(age<0)
//		{
//			throw new IllegalArgumentException("age cannot be negative");
//		}
//	}

	public static void main(String[] args) {
        //Null pointer Exception
      // String str = null;
      // System.out.println(str.length());
		
		// ArrayOutOfIndexException
		//int [] arr = {1,2,3};
		//System.out.println(arr[3]);
		
		//Arithemtic Exception
	//	int result =10/0;
	//	System.out.println(result);
		
		//ClasscastException
		Object obj1 = new Integer(42);
	//	String str = (String)obj1;
		Integer num = (Integer)obj1;
		System.out.println(num);
		
		//IllegalArgumentException
	//	int age = -5;
	//	setAge(age);
		
		//NumberFormatException
	  //	String number ="abc";
	 //	int result = Integer.parseInt(number);
		
		//IndexOutOfBoundException
	//	String str = "hello";
	//	System.out.println(str.charAt(5));
		
		
		//IllegalStateException
//		List<String> list = new ArrayList<>();
//		Iterator<String> itr = list.iterator();
//		itr.remove();
	}
	
	

}
