package Strings;

public class StringBuilderExample {

	public static void main(String[] args) {
     
      StringBuilder sb = new StringBuilder("Hello");
      sb.append(" world");
      System.out.println("After append:"+sb.toString());
      
      
      sb.insert(5, ",");
      System.out.println("After insert:"+sb.toString());
      
      sb.delete(5, 6);
      System.out.println("After delete:"+sb.toString());
      
      sb.replace(6, 11, "java");
      System.out.println("After replace:"+sb.toString());
      
      sb.reverse();
      System.out.println("After reverse:"+sb.toString());
      
      int length = sb.length();
      System.out.println("Length:"+length);
      
      int capacity = sb.capacity();
      System.out.println("Capacity:"+capacity);
      
	}

}
