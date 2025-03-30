package data_structure;

import java.util.Scanner;

public class treeMain {

	private static binarySearchTree bst = new binarySearchTree();
	private static Node root; //rootNode
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bst.showList();
		while(true) {
			String command = sc.next().trim();
			if(command.equals("add")) {
				bst.add(bst, sc);
			}else if(command.equals("delete")) {
				System.out.println("삭제할 정수를 입력하세요.");
				int num = sc.nextInt();
				System.out.println("삭제할 정수 :" + num);
				bst.delete(root, num);
			}else if(command.equals("search")) {
				System.out.println("검색할 정수를 입력하세요.");
				int num = sc.nextInt();
				System.out.println("검색할 정수 :" + num);
				Node findNode = bst.search(root, num);
				if(findNode == null) System.out.println("검색한 값이 존재하지 않습니다.");
				else System.out.println("검색한 값이 존재합니다!" + findNode.getVal());
			}else if(command.equals("max")) {
				Node maxNode = bst.findMax(root);
				System.out.println("가장 큰 값은 " + maxNode.getVal() + "입니다!");
			}else if(command.equals("min")) {
				Node minNode = bst.findMini(root);
				System.out.println("가장 작은 값은 " + minNode.getVal() + "입니다!");
			}else if(command.equals("show")) {
				bst.show();
			}else if(command.equals("exit")) {
				return;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
