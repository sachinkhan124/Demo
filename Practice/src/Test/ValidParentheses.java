package Test;

import java.util.List;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
        String s = "(){}[]";
        System.out.println(isvalid(s));
	}

	private static boolean isvalid(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(char c :s.toCharArray())
		{
			if(c=='(' || c=='{' || c=='[')
			{
				stack.push(c);
			}
			else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } 
			else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } 
			else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
			else
			{
				return false;
			}
		}
		return  stack.isEmpty();
	}

}
