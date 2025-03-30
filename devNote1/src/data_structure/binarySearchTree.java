package data_structure;
import java.util.Scanner;

public class binarySearchTree {

	private static Node root; //rootNode
	
	public void add(binarySearchTree bst , Scanner sc) { //추가
		System.out.println("값을 몇번 넣으시겠습니까?");
		int cnt = sc.nextInt();
		sc.nextLine();
		System.out.println(cnt+"번 넣을게요. 입력해주세요!");
		for(int i=1;i<=cnt;i++) {
			bst.addNode(sc.nextInt());
		}
		System.out.println("add complete!");
	}
	
	public static void addNode(int val) { //추가
		Node newNode = new Node(val);
		if(root == null) { //root가 null이면  객체생성
			root = newNode;
			return;
		}
		
		Node currntNode = root;
		Node parentNode = null;
		
		while(true) {
			parentNode = currntNode ;
			if( val < parentNode.getVal()) { // val값이 현재 parentNode보다 크다면, 왼쪽으로 가지를 뻗어나가야 한다
				currntNode = currntNode.getLeft();
				if(currntNode == null) {//null == >  마지막요소
					parentNode.setLeft(newNode); //부모의 left에 셋팅
					return;
				}else if(currntNode.getVal() == newNode.getVal()) { //값이 같다면 리턴
					return;
				}
			}else if(val > parentNode.getVal()) { // val값이 현재 parentNode보다 크다면, 오른쪽으로 가지를 뻗어나가야 한다
				currntNode = currntNode.getRight();
				if(currntNode == null) { //null == >  마지막요소
					parentNode.setRight(newNode); //부모의 right에 셋팅
					return;
				}else if(currntNode.getVal() == newNode.getVal()) {//값이 같다면 리턴
					return;
				}
			}
		}
	}
	
	public Node delete(Node root, int number) { //삭제
		if(root == null) return null;
		if(number <root.getVal()) {
			if(root.getLeft() == null) System.out.println(number+"값이 없습니다!");
			else root.setLeft(delete(root.getLeft(), number));
		}else if(number > root.getVal()) {
			if(root.getRight() == null) System.out.println(number+"값이 없습니다!");
			else root.setRight(delete(root.getRight(), number));
		}else {
			if(root.getLeft() == null && root.getRight() == null) return null;
			else if(root.getLeft() == null) return root.getRight();
			else if(root.getRight() == null) return root.getLeft();
			
			root.setVal(findMax(root.getRight()).getVal());
			root.setRight(delete(root.getRight(), root.getVal()));
		}
		return root;
	}
	
	public Node search(Node root, int number) { //찾기
		if(root == null) return null;
		if(number == root.getVal()) { //찾고자 하는 값이 root에 있다면,
			return root;
		}else if(number <= root.getVal()) { //루트의 값이 더크다면
			return search(root.getLeft(), number);
		}else { 
			return search(root.getRight(), number);
		}
	}
	
	public Node findMax(Node root) { // 최댓값찾기
		if(root == null) return null;
		if(root.getRight() != null) {
			return findMax(root.getRight());
		}
		return root;
	}
	
	public Node findMini(Node root) { // 최솟값찾기
		if(root == null) return null;
		if(root.getLeft() != null) {
			return findMini(root.getLeft());
		}
		return root;
	}
	
	public void show() {
		System.out.println("오름순회:");
		leftInorder(root);
		System.out.println();
	}
	
	public void leftInorder(Node node) { //오름차순
		if(node == null) return;
		leftInorder(node.getLeft());
		System.out.println(node.getVal());
		leftInorder(node.getRight());
	}
	
	public void showList() { 
		System.out.println("binarySearchTree console");
		System.out.println("add");
		System.out.println("delete");
		System.out.println("search");
		System.out.println("max");
		System.out.println("min");
		System.out.println("show");
		System.out.println("exit");
	}
}