package Test;

public class Commonprefix {

	public static void main(String[] args) {
		String str[] = {"flower","fly","flight"};
		  String result = commonPrefix(str);
		  System.out.println(result);
	}

	private static String commonPrefix(String[] str) {
		if(str==null || str.length==0)
		{
			return "";
		
		}
		  String prefix =str[0];
		for(int i=0;i<str.length;i++)
		{
			while(str[i].indexOf(prefix)!=0)
			{
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())
				{
					return "";
				}
			}
		}
		return prefix;
	}

}
