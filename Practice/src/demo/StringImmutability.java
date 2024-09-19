package demo;

public class StringImmutability {

	public static void main(String[] args) {
	String originalString = "Hello";
	System.out.println("original String:"+originalString);
	String modifiedString = originalString.concat("world");
	System.out.println("modifiedString:"+modifiedString);
	System.out.println("original string after changes modified String:"+originalString);
	
	if(originalString==modifiedString)
	{
		System.out.println("two strings are same objects");
	}
	else
	{
		System.out.println("two strings are different objects");
	}

	}

}
