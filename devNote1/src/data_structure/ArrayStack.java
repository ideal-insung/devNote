package data_structure;

public class ArrayStack {

	int size;
	int top;
	Object data[];
	
	
	public ArrayStack(int size){
		this.data = new Object[size];
		this.top = -1 ; 
		this.size = size;
	}
	
	public boolean isEmpty() {
	    return this.top == -1;
	}
	
	public boolean isFull() {
		return this.size == this.top+1;
	}
	
	public void push(Object obj) {
		if(isFull()) throw new IndexOutOfBoundsException();
		data[++top] = obj;
	}
	public Object pop() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		return data[top--];
	}
	public Object peek() {
		if(isEmpty()) throw new IndexOutOfBoundsException();
		return data[top];
	}
}
