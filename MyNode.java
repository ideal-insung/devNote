package data_structure;

public class MyNode{
	Object data;
	MyNode next;
	
	public MyNode() { //node의 생성자함수
		this.data = null;
		this.next = null;
	}
	
	public String getData() {
		return String.valueOf(this.data);
	}
}
