package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Tester {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,3,4,6,7,8);
		System.out.println("print all Numbers:"+list);
		Eval(list, n->n%2==0);
		System.out.println("print all even numbers");
		Eval(list, n ->n>3);
		System.out.println("greater than 3");
		
	}

	private static void Eval(List<Integer> list, Predicate<Integer> predicate) {
		
		for(Integer n : list)
		{
			if(predicate.test(n))
			{
				System.out.println(n+ "");
			}
		}
	}

}
