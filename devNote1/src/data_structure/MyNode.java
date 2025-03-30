package data_structure;

public class MyNode{
	public Object data;
	public MyNode next;
	public int cost;
	
	public MyNode() { //node의 생성자함수
		this.data = null;
		this.next = null;
	}
	
	public MyNode(Object data) { //node의 생성자함수
		this.data = data;
		this.next = null;
	}
	
	public String getData() {
		return String.valueOf(this.data);
	}
}
