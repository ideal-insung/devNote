package data_structure;

public class Node {

	private int val;    // node value
	private Node left;  // left node
	private Node right; // right node
	
	public Node(int val) {
		this.setVal(val);
		setLeft(null);
		setRight(null);
	}
	
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}
