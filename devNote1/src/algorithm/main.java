package algorithm;
import data_structure.LinkedListGraph;

public class main {
	public static void main(String[] args) {
		LinkedListGraph lls = new LinkedListGraph(10);
		lls.addEdge(0, 1);
		lls.addEdge(1, 2);
		lls.addEdge(1, 3);
		lls.addEdge(2, 4);
		lls.addEdge(2, 3);
		lls.addEdge(3, 4);
		lls.addEdge(3, 5);
		lls.addEdge(5, 6);
		lls.addEdge(5, 7);
		lls.addEdge(6, 8);
	
		dfsBfs dfbf = new dfsBfs(lls, lls.array.length);
		dfbf.dfs_stack(0);
		System.out.println();
		dfbf.dfs_recursion(0);
		System.out.println();
		dfbf.bfs_queue(0);
	}
}
