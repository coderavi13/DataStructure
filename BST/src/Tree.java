import java.util.ArrayList;
import java.util.List;

public class Tree {

	private class Node {
		private int value;
		private Node rightChild;
		public Node leftChild;

		public Node(int value) {
			super();
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}
	}

	private Node root;

	public void insert(int value) {
		Node node = new Node(value);

		if (root == null) {
			root = node;
			return;
		}
		Node current = root;
		while (true) {
			if (value < current.value) {
				if (current.leftChild == null) {
					current.leftChild = node;
					break;
				}
				current = current.leftChild;
			} else {
				if (current.rightChild == null) {
					current.rightChild = node;
					break;
				}
				current = current.rightChild;
			}

		}
	}

	public boolean find(int value) {


		Node current = root;
		while (current != null) {
			if (value < current.value) {
				current = current.leftChild;
			} else if (value > current.value) {
				current = current.rightChild;
			} else
				return true;

		}
		return false;
	}
	
	public void preOrderTraversal() {
		preOrderTraversal(root);
	}
	private  void preOrderTraversal(Node root) {	
		if (root==null) {
			return;
		}
		System.out.print(" " + root.value);
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	private  void inOrderTraversal(Node root) {
		
		if (root==null) {
			return;
		}		
		preOrderTraversal(root.leftChild);
		System.out.print(" " + root.value);
		preOrderTraversal(root.rightChild);		
	}
	
	public void postOrderTraversal() {
		postOrderTraversal(root);
	}
	private  void postOrderTraversal(Node root) {
		
		if (root==null) {
			return;
		}	
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);
		System.out.print(" " + root.value);
		
	}

	public int height() {
		return height(root);
	}
	
	private int height(Node root) {
		if (root==null) {
			return -1;
		}
		if(root.leftChild ==null && root.rightChild == null) {
			return 0;
		}	
		return 1+ Math.max(height(root.leftChild), height(root.rightChild));
	
	}
	
	public int minValue() {
		return minValue(root);
	}
	
	private int minValue(Node root) {
		
		if(root.leftChild ==null && root.rightChild == null) {
			return root.value;
		}
		int left =minValue(root.leftChild);
		int right =minValue(root.leftChild);
		
		return Math.min(Math.min(left, right), root.value);
	}

	
	public boolean isBST() {
		return isBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	
	
	private boolean isBST(Node root,int min,int max) {
		
		if(root == null )
		return true;
		
		if(root.value > max || root.value < min)
			return false;
			
		return isBST(root.leftChild, min,root.value -1) && isBST(root.rightChild, root.value+1,max);
		
	}
	
	public ArrayList<Integer> getNodeAtDistance(int distance)
	{
		ArrayList<Integer> list =new ArrayList<>();
		 getNodeAtDistance(root, distance,list);
		 return list;
	}
	
	private void getNodeAtDistance(Node root, int distance, List<Integer> list) {
		if(root == null )
			return ;
		
		if(distance == 0) {
			list.add(root.value);
			return;
		}
		
		getNodeAtDistance(root.leftChild,distance-1,list);
		getNodeAtDistance(root.rightChild,distance-1,list);	
	}

	
	public void traversNodeAtDistance() {
		
		for(int i = 0 ;i <= height();i++) {
			for(int value : getNodeAtDistance(i)) {
				System.out.println(value);
			}
		}
	}
}
