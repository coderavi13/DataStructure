import java.util.Stack;

public class Driver {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String str = "Ravindra";
		
		for (char ch : str.toCharArray()) {
			stack.push(ch);	
		}
		
		StringBuilder reversed = new StringBuilder();
		
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		System.out.println(reversed);
		
		}

}
