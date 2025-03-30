package data_structure;

public class LinkedListStack {

	MyNode head = null;
	
	public boolean isEmty() {
		return head == null; 
	}
	
	public void push(Object obj) {
		//���� ���� ��ҿ� �߰�
		MyNode node = new MyNode();
		node.data = obj;
		
		if(!isEmty()) {
			node.next = this.head;
		}
		this.head = node;
	}
	
	public Object pop() {
		//������ ������ ��Ҹ� �����ϸ� ��ȯ
		if(isEmty()) throw new ArrayIndexOutOfBoundsException();
		 
		MyNode tmpNode = this.head;
		Object returnData = this.head.data;
		
		this.head = this.head.next;
		tmpNode.next = null;
		tmpNode.data = null;
		return returnData;
	}
	
	public Object peek() {
		// ������ �� ����Ҹ� ��ȯ
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
