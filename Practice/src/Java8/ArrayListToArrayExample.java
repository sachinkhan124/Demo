package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayExample {

	public static void main(String[] args) {
     
	List<String> list = new ArrayList<>();
	  list.add("java");
	  list.add("c++");
	  list.add("python");
	  
	  String[] array = new String[list.size()];
	   list.toArray(array);
	   for(String element : array)
	   {
		   System.out.println(element);
	   }
		
     
	   String[] lists = {"apple","orange","banana"};
	   
	   List<String> ArrtoList = new ArrayList<>(Arrays.asList(lists));
	   for(String n : ArrtoList)
	   {
		   System.out.println(n);
	   }
	   
	}

}
