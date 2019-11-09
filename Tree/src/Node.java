
public class Node {
	
	int value;
	Node lNode;
	Node rNode;
	public Node(int value, Node lNode, Node rNode) {
		super();
		this.value = value;
		this.lNode = lNode;
		this.rNode = rNode;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getlNode() {
		return lNode;
	}
	public void setlNode(Node lNode) {
		this.lNode = lNode;
	}
	public Node getrNode() {
		return rNode;
	}
	public void setrNode(Node rNode) {
		this.rNode = rNode;
	}
}
