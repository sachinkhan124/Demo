package abstractdemo;

public class CalcualtorExample {

	public static void main(String[] args) {
     
		Calculator addition = (a,b) ->(a+b);
		
		int result  = addition.calculator(10, 5);
		
		System.out.println("Result:"+result);

	}

}
