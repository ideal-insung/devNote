package data_structure;

import java.util.Arrays;
public class linkList {

	private Node head;
	private Node tail;
	private int size;
	private class Node{
		private Object data;
		private Node next;
		public Node(Object data) { //node의 생성자함수
			this.data = data;
			this.next = null;
		}
		public String getData() {
			return String.valueOf(this.data);
		}
	}
	
	public String toString() { //연결리스트 toString
		Node n = head;
		if(head == null) return "[]";
		Object[] arrays = new Object[size]; //obj배열 인스턴스생성
		int idx=0; //반복idx
		while(n != null) { //노드가 null이 아니면
			arrays[idx] =n.data; //idx에 데이터 저장
			idx ++;
			n = n.next; //다음노드이동
		}
		return Arrays.toString(arrays);
	}
	
	public int searchNode(int idx, Object obj) { //data를 가지는 서치함수 인덱스를 리턴받을것이기 때문에 int형
		Node node = head;
		int targetIdx = 0; // targetIdx 초기화
		if(obj instanceof String) obj = String.valueOf(obj); //만약 obj가 string타입이라면 형변환
		else obj = Integer.parseInt(String.valueOf(obj)); //int 타입이라면 int 형변환
		for(int i = 0; i< idx; i++) {
			if(node.getData().equals(obj)) { // 노드의data가 obj과 일치한다면 break;
				break;
			}
			targetIdx = i; //해당 targetIdx를 인덱스저장
			node = node.next;  
		}
		return targetIdx;
	}
	
	public Node searchNode(int idx) { //인덱스로 찾고하자는 노드리턴
		Node node = head; 
		for(int i = 0; i < idx; i++) { //idx까지 서치
			node = node.next;
		}
		return node; 
	}
	
	public void addFirst(Object data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		size ++ ;
		node.data = data;
		if(head.next == null ) tail=head;  //만약 유일한 노드일경우 head와 tail은 같다
	}
	
	public void addLast(Object data) {
		Node n = head;
		if(n == null) addFirst(data); //노드가 없다면 firstadd함수
		else {
			while(n.next != null) { //next가 없을때까지 
				n= n.next;          //다음노드 탐색
			}
			Node addNode = new Node(data); //새로운 노드 인스턴스 생성
			n.next = addNode;              //next 저장
			size++;                        //cnt+1
			tail = addNode;                //tail값 저장
		}
	}
	
	public boolean add(Object obj) {
		Node n = head;
		if(n == null) addFirst(obj);  //노드가 없다면 firstadd함수
		else addLast(obj);            //lastadd 호출
		return true;
	}
	
	public boolean add(int idx, Object data) {
		if(idx < 0 ) throw new RuntimeException();
		else if(idx == 1) addFirst(data);
		else if(idx > 1) {
			Node addNode = new Node(data); //노드 인스턴스 생성
			Node tmp = searchNode(idx);    //서치할노드 템프노드에 저장
			searchNode(idx - 1).next = addNode; // 찾을노드 이전노드의 next값 세팅
			addNode.next = tmp; //추가할 노드의 next 기존에 저장한 값
			size++; //size +1
		}
		return true;
	}
	
	public Object remove() { // object 반환하는 remove함수
		Object tmp = head.data; // head의 데이터를 템프에 저장
		head = head.next;       
		size --;
		return tmp;
	}
	
	public void removeFirst() { //첫번째 요소 지우는함수
		head = head.next;
		size --;
	}
	
	public void removeLast() { // 마지막요소 지우는함수
		remove(size - 1);
	}
	
	
	public void remove(int idx) {
		if(idx < 1 || size < idx) throw new RuntimeException();
		else if(idx == 0 ) removeFirst();
		else if(idx == size-1 ) {  //size-1 인 이유는 else에서 사이즈보다 더 높은 인덱스를 요구하기에 불가능
			Node tmpNode = searchNode(idx - 1); //템프노드에 저장
			tmpNode.next = null; //null처리
			size --;
		}else {
			searchNode(idx-1).next = searchNode(idx+1);
			size --;
		}
	}
	
	public boolean remove(Object obj) { // 노드의 data로 찾는함수
		remove(searchNode(size-1, obj)); //찾고자하는 노드의 인덱스반환
		return true;
	}
	
	public String getTailData() {
		return tail.getData();
	}
}
