package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMainExample {

	public static void main(String[] args) {
     
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"abc"));
		list.add(new Employee(2,"pqr"));
		list.add(new Employee(3,"prs"));
		Collections.sort(list);
		
		for(Employee  n : list)
		{
			System.out.println(n);
		}
		
	}

}
