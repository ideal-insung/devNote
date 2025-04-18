package algorithm;

import java.util.ArrayList;

import algorithm.Edge;

public class MSTmain {

	
	public static void main(String[] args) {
		//MST mst = new MST(7);
		//mst.union(1, 2);
		//mst.union(2, 3);
		//mst.union(3, 4);
		//
		//mst.union(5, 6);
		//mst.union(5, 7);
		//mst.union(6, 7);
		//
		//System.out.println(mst.isConnect(1, 6));
		//mst.union(1, 5);
		//System.out.println(mst.isConnect(1, 6));
		ArrayList<Edge>array = new ArrayList<Edge>();
		
		array.add(new Edge(1, 2, 5));
		array.add(new Edge(1, 3, 4));
		array.add(new Edge(2, 3, 2));
		array.add(new Edge(2, 4, 7));
		array.add(new Edge(3, 4, 6));
		array.add(new Edge(4, 6, 8));
		array.add(new Edge(3, 5, 11));
		array.add(new Edge(4, 5, 3));
		array.add(new Edge(5, 6, 8));
        
		MST mst1 = new MST(array,7,11);
		mst1.MinimumSpanningTree();
		mst1.showArr();
	}
}
