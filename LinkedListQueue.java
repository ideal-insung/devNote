package data_structure;

public class LinkedListQueue {

	MyNode head = null; 
	MyNode tail = null;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void enQueue(Object data) {
		MyNode newNode = new MyNode();
		newNode.data = data; //newNode value 초기화
		newNode.next = null; //newNode next 초기화

		if(isEmpty()) { //큐가 비어있다면,
			this.head= newNode; 
			this.tail = newNode;
			return;
		}

		this.tail.next = newNode;
		this.tail = newNode;
	}
	
	public Object deQueue() {
		if(isEmpty()) throw new NullPointerException();
		Object obj = this.head.data; //해당 data 저장
		MyNode tmpNode = this.head; //tmpNode 저장
		this.head = this.head.next; //next를 헤드값으로저장
		tmpNode.next = null; //초기화
		tmpNode.data = null; //초기화
		if(this.head == null) this.tail = null; //만약 head가 null이면 tail도 null로 초기화
		return obj;
	}
}
