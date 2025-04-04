package algorithm;

import java.util.LinkedList;
import java.util.Stack;

import data_structure.LinkedListGraph;
import data_structure.LinkedListQueue;

public class dfsBfs { //DFS&BFS

	
	boolean visited [];
	LinkedList<Integer> []array;
	
	public dfsBfs(LinkedListGraph graph, int size) {
		this.array  = graph.array;
		this.visited = new boolean[size];
	}
	
	public void dfs_recursion(int start) {
		visited[start] = true;
		System.out.print(start + " ");
		for(int a : array[start]) {
			if(!visited[a]) {
				visited[a] = true;
				dfs_recursion(a);
			}
		}
	}
	
	public void dfs_stack(int start) {
		Stack<Integer> stack = new Stack<Integer>();
		boolean visited [] = new boolean[array.length];
		stack.push(start);
		visited[start] =true;
		while(!stack.empty()) {
			int popData = stack.pop();
			for(int a : array[popData]) {
				if(!visited[a]) {
					visited[a] = true;
					stack.push(a);
				}
			}
			showArray(popData);
		}
	}
	
	public void bfs_queue(int start) {
		LinkedListQueue que= new LinkedListQueue();
		boolean[] isVisited = new boolean[array.length];
		
		que.enQueue(start);
		isVisited[start] = true;
		
		while(!que.isEmpty()) {
			int idx = (int)que.deQueue();
			for(int a:array[idx]) {
				if(!isVisited[a]) {
					que.enQueue(a);
					isVisited[a]= true;
				}
			}
			showArray(idx);
		}
	}
	
	public void showArray(int data) {
		System.out.print(" "+data);
	}
	
}
