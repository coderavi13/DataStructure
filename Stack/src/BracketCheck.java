import java.util.Stack;

public class BracketCheck {

	public static void main(String[] args) {
	
		String str= "{}1+2";
		
		System.out.println("Is expression is balanced : " + isBalanced(str));

	}
	
	static boolean isBalanced(String exp) {
		if(exp == null || exp == "") {
			return false;
		}
		Stack<Character> stack =new Stack<>();
		
		for (Character ch: exp.toCharArray()) {
			if(ch == '(' ||ch == '{' ||ch == '<' ||ch == '[') {
				stack.push(ch);
			}
			if(ch == ')' ||ch == '}' ||ch == '>' ||ch == ']') {
				if(stack.empty()) return false;
				char top = stack.pop();
				if((ch == ')' && top != '(') ||
				   (ch == '}' && top != '{' )||
				   (ch == '>' && top != '<' )||
				   (ch == ']' && top != '['))  
					return false;
			}
		}
		
		return stack.empty();
	}

}
