import java.util.List;

public class Driver {

	public static void main(String[] args) {
	
		Tree tree = new Tree();
		tree.insert(7);
		tree.insert(4);
		tree.insert(9);
		tree.insert(1);
		tree.insert(6);
		tree.insert(8);
		tree.insert(10);
		tree.preOrderTraversal();
		System.out.println();
		tree.inOrderTraversal();
		System.out.println();
		tree.postOrderTraversal();
		
		System.out.println("Height of tree : " + tree.height());
		System.out.println("Minimum value in tree : " + tree.minValue());
		
		System.out.println("IS BST " + tree.isBST());
		 List<Integer> list = tree.getNodeAtDistance(1);
		 
		 for (Integer integer : list) {
			 System.out.println(integer);
		}

		 tree.traversNodeAtDistance();
	}

}
