package algorithm;

import algorithm.Edge;

class Edge implements Comparable<Edge>{
	int x;    //1번노드
	int y;    //2번노드
	int cost; //비용
	public Edge(int x, int y, int cost) {
		this.x= x;
		this.y= y;
		this.cost= cost;
	}
	
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
}
