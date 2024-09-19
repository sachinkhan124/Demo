package abstractdemo;

public class OverloadExample {
	
	private void display(int a)
	{
		System.out.println("Argument:"+a);
	}
	
	private void display(int a, int b)
	{
		System.out.println("value of:"+a+"and"+b);
	}
	
	private void display(String str)
	{
		System.out.println("String:"+str);
	}

	public static void main(String[] args) {
      OverloadExample example = new OverloadExample();
      example.display(10);
      example.display(10, 5);
      example.display("abc");
		
	}

}
