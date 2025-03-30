package data_structure;

import java.util.LinkedList;

public class HashTable {

	LinkedList<Node>[] list;
	int size;
	class Node {
		String key;
		String value;
		
		public Node(String key, String value) {
			this.key   = key;
			this.value = value;
		}
	}
	
	public HashTable(int size) {
		list = new LinkedList[size];
		this.size = size;
	}
	
	public int makeIdx(String key) { //hashȭ �ϴ� �Լ�
		int hashCode = 0;
		for(char c:key.toCharArray()) {
			hashCode+= c;
		}
		return hashCode%size; 
	}
	
	public void Hashput(String key, String value) {
		int idx = makeIdx(key);
		LinkedList<Node> dataList = list[idx];
		if(dataList == null) {
			dataList = new LinkedList<Node>();
			list[idx] = dataList;
		}
		Node findNode = searchNode(list[idx], key);
		if(findNode == null) {
			dataList.add(new Node(key,value));
		}else {
			findNode.value = value; //���� ����Ű���� �������ִٸ�, ���� value������ ����
		}
	}
	
	public Node searchNode(LinkedList<Node> data, String keys) {
		if(data == null) return null;
		for(Node node : data) {
			if(node.key.equals(keys)) {
				return node;
			}else {
				return null;
			}
		}
		return null;
	}
	
	public String getHashTable(String key) {
		int idx = makeIdx(key);
		LinkedList<Node> dataList = list[idx];
		Node findNode = searchNode(dataList, key);
		if(findNode != null) return findNode.key + " " + findNode.value;
		else return null;
	}
}
