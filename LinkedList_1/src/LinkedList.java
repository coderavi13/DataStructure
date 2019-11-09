
public class LinkedList {

	private class Node {

		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

	}

	private Node first;
	private Node last;

	public void addLast(int value) {

		Node node = new Node(value);
		if (first == null) {
			last = first = node;
		}
		else {
			last.next =node;
			last=node;
		}
	}

}

