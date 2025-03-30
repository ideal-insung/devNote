package data_structure;

import java.util.LinkedList;

public class LinkedListGraph {
	public LinkedList<Integer>[] array;
	public int vertexCnt;
	
	public LinkedListGraph(int size) {
		this.vertexCnt = size;
		this.array = new LinkedList[size];
		for(int i=0; i<size; i++) {
			array[i] = new LinkedList();
		}
	}
	
	public void addEdge(int x, int y) {
		this.array[x].add(y);
		this.array[y].add(x);
	}
	
	
	public void display() {
		for(int i=0;i<=vertexCnt-1;i++) {
			System.out.print("vertex "+i+":");
			System.out.print(array[i]);
			System.out.println();
		}
	}
}
