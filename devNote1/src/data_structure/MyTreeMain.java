package data_structure;

public class MyTreeMain {
	static int preIdx = 0; 
	
	public static int getInOrderIdx (int in[], int start, int end, int target) { 
		for(int i=start; i<=end; i++) {
			if(in[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static MyTreeNode tree_restore(int pre[] , int in[] , int start , int end) {
		
		MyTreeNode node = null;
		if(start <= end) { 
			node = new MyTreeNode(); 
			node.value = pre[preIdx++];
			node.rightNode = null;
			node.leftNode  = null; 
			int inIdx = getInOrderIdx(in, start, end, node.value);
			node.leftNode  = tree_restore(pre, in, start, inIdx-1); //start~inIdx-1
			node.rightNode = tree_restore(pre, in, inIdx+1, end);   //inIdx+1 ~ end
		}
		
		return node;
	}
	
	static void show(MyTreeNode root) {
		rightInorder(root);
	}
	
	static void rightInorder(MyTreeNode node) { 
		if(node == null) return;
		rightInorder(node.leftNode);
		rightInorder(node.rightNode);
		System.out.print(node.value+"-");
	}
	
	public static void main(String[] args) {
		MyTreeNode root = null ; 
		int preorder[] = {1,2,4,5,3,6};
		int inorder[]  = {4,2,5,1,3,6};
		
		root = tree_restore(preorder , inorder , 0 , 5); 
		show(root); 
	}
}
