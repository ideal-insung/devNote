package data_structure;

public class LinkedListStack {

	MyNode head = null;
	
	public boolean isEmty() {
		return head == null; 
	}
	
	public void push(Object obj) {
		//스택 맨위 요소에 추가
		MyNode node = new MyNode();
		node.data = obj;
		
		if(!isEmty()) {
			node.next = this.head;
		}
		this.head = node;
	}
	
	public Object pop() {
		//스택의 맨위의 요소를 삭제하며 반환
		if(isEmty()) throw new ArrayIndexOutOfBoundsException();
		 
		MyNode tmpNode = this.head;
		Object returnData = this.head.data;
		
		this.head = this.head.next;
		tmpNode.next = null;
		tmpNode.data = null;
		return returnData;
	}
	
	public Object peek() {
		// 스택의 맨 위요소를 반환
		if(isEmty()) throw new ArrayIndexOutOfBoundsException();
		return this.head.data;
	}
	
	public void display() {
		MyNode curNode = head;
		while(curNode.next != null) {
			System.out.println(curNode.getData());
			curNode = curNode.next;
		}
	}
}
