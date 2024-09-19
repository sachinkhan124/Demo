package Java8;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Person, String> map = new HashMap<>();
		
		Person p1 = new Person("Alice",20);
		Person p2 = new Person("Slice" ,10);
		
		map.put(p1, "Manager");
		map.put(p2, "HR");
		
		Person p3 = new Person("Alice", 20);
		
		System.out.println("Role of Alice:"+map.get(p3));
	}

}
