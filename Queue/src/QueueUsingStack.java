import java.util.Stack;

public class QueueUsingStack {

	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();

	public void enqueue(int item) {
		stack1.push(item);
		System.out.println(stack2.isEmpty());
	}

	public int dequeue() {

		if (isEmpty()) {
			throw new IllegalStateException();
		}

		moveStack1ToStack2();
		return stack2.pop();
	}

	private void moveStack1ToStack2() {
		if (stack2.empty() && !stack1.empty()) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}
	}

	public int peek() {

		if (isEmpty()) {
			throw new IllegalStateException();
		}

		moveStack1ToStack2();
		return stack2.peek();
	}

	public boolean isEmpty() {
		return stack2.empty() && stack1.empty();
	}
}
