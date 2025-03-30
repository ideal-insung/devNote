package data_structure;

public class LinkedListQueue {

	MyNode head = null; 
	MyNode tail = null;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void enQueue(Object data) {
		MyNode newNode = new MyNode();
		newNode.data = data; //newNode value �ʱ�ȭ
		newNode.next = null; //newNode next �ʱ�ȭ

		if(isEmpty()) { //ť�� ����ִٸ�,
			this.head= newNode; 
			this.tail = newNode;
			return;
		}

		this.tail.next = newNode;
		this.tail = newNode;
	}
	
	public Object deQueue() {
		if(isEmpty()) throw new NullPointerException();
		Object obj = this.head.data; //�ش� data ����
		MyNode tmpNode = this.head; //tmpNode ����
		this.head = this.head.next; //next�� ��尪��������
		tmpNode.next = null; //�ʱ�ȭ
		tmpNode.data = null; //�ʱ�ȭ
		if(this.head == null) this.tail = null; //���� head�� null�̸� tail�� null�� �ʱ�ȭ
		return obj;
	}
}
