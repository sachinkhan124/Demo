package abstractdemo;

public class Whitespace {

	public static void main(String[] args) {
       String str = " Hello world ";
       System.out.println(str.strip());
       System.out.println(str.trim());
     
       String [] parts = str.split(" ");
       for(String s : parts)
       {
    	   if(!s.isEmpty())
    	   {
    		   System.out.println("Spilt String:"+s);
    	   }
       }
       
       StringBuilder sb = new StringBuilder();
       char [] arr = str.toCharArray();
       for(char c : arr)
       {
    	   if (!Character.isWhitespace(c)) {
    		    sb.append(c);
    	   }
       }
        System.out.println(sb.toString());
	}

}
