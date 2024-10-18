package Strings;

public class AnangramUsingStringBuilder {
	
	
	public static boolean Isanagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
        String sorted1 = str1.toLowerCase().chars().sorted().collect(StringBuilder:: new ,StringBuilder:: appendCodePoint, StringBuilder::append).toString();
        String sorted2 = str2.toLowerCase().chars().sorted().collect(StringBuilder:: new ,StringBuilder:: appendCodePoint, StringBuilder::append).toString();
        return sorted1.equals(sorted2);
	}

	public static void main(String[] args) {
     String str1="Listen";
     String str2 = "Silent";
     boolean ret = Isanagram(str1, str2);
     if(ret)
     {
    	 System.out.println("str1 and str2 are Anagrams");
     }
     else
     {
    	 System.out.println("str1 and str2 arenot Anagrams");
     }

	}

}
