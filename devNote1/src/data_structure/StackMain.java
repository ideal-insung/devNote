package data_structure;

import java.util.Queue;

public class StackMain {

	public static void main(String[] args) {
		LinkedListStack lls = new LinkedListStack();

		lls.push("A");
		lls.push("B");
		lls.push("C");
		lls.push("D");
		
		while(!lls.isEmty()) {
			System.out.print("pop�� ������ :");
			System.out.println(lls.pop());
		}
		
	}
}
