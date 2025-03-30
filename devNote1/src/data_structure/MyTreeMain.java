package data_structure;

public class MyTreeMain {
	static int preIdx = 0; //preOrder의 배열을 저장하기위한 preIndex
	
	//inOrder배열에서 찾아야할 값을 구해서 인덱스를 리턴시킨다
	public static int getInOrderIdx (int in[], int start, int end, int target) { 
		for(int i=start; i<=end; i++) {
			if(in[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static MyTreeNode tree_restore(int pre[] , int in[] , int start , int end) {
	
		//일단 pre의 인덱스를 구해서 , inorder 의 인덱스를 찾아서 왼쪽자식,오른쪽자식을 나눈다
		
		MyTreeNode node = null;
		if(start <= end) { // 재귀함수사용하므로 조건설정
			node = new MyTreeNode();  //노드객체를 만든다.
			node.value = pre[preIdx++]; //preOrder에서 preIdx의 값을 새로운 노드에 value로 저장한다.
			//preOrder의서 0번째 값을 root로 설정한다.
			node.rightNode = null;
			node.leftNode  = null; 
			int inIdx = getInOrderIdx(in, start, end, node.value);
			node.leftNode  = tree_restore(pre, in, start, inIdx-1); //start~inIdx-1 까지 재귀함수
			node.rightNode = tree_restore(pre, in, inIdx+1, end);   //inIdx+1 ~ end 까지 재귀함수
		}
		
		return node;
	}
	
	static void show(MyTreeNode root) {
		System.out.print("후위 순회:");
		rightInorder(root);
	}
	
	static void rightInorder(MyTreeNode node) { //오름차순
		if(node == null) return;
		rightInorder(node.leftNode);
		rightInorder(node.rightNode);
		System.out.print(node.value+"-");
	}
	
	public static void main(String[] args) {
		MyTreeNode root = null ; //root를 null로 초기화한다.
		int preorder[] = {1,2,4,5,3,6};
		int inorder[]  = {4,2,5,1,3,6};
		
		//treeRestore 함수에 인자로, preorder , indorder , 첫번째인덱스, 마지막인덱스를 보낸다
		root = tree_restore(preorder , inorder , 0 , 5); 
		show(root); //이를 후위순위로 정렬해보면
	}
}
