package data_structure;

public class ArrayQueue { //¿øÇüÅ¥

	int front; // deque ÀÎµ¦½º
	int rear;  // inque ÀÎµ¦½º
	int size;  // 
	int cnt;
	Object data[];
	
	public ArrayQueue(int size) {
		this.front = 0;
		this.rear  = 0;
		this.size  = size;
		this.cnt   = 0;
		this.data  = new Object[size];
	}
	
	public boolean isEmpty() {
		return (rear == front) && cnt < 0;
	}
	
	public boolean isFull() {
		return (rear == front) && cnt > 0;
	}
	
	public void enQueue(Object obj) {
        if(isFull()) throw new IndexOutOfBoundsException();
		if(rear == size) rear = 0;
        data[rear++] = obj;
		cnt ++;
	}
	
	public Object deQueue() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		if(front == size) front = 0;
		cnt --;
		return data[front++];
	}
	
}
