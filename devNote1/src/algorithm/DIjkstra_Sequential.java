package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
6 9
0 2 30
0 1 50
1 3 30
1 4 70
2 3 20
2 4 40
3 4 10
3 5 80
4 5 30 
0
*/
public class DIjkstra_Sequential {
	public static class Node{
		int idx;
		int cost;
		
		public Node(int idx, int cost) {
			this.idx  = idx;
			this.cost = cost;
		}
	}
	
	public static void show(ArrayList<ArrayList<Node>> arr) {
		for(int i=0; i<arr.size();i++) {
			for(int j=0;j<arr.get(i).size();j++) {
				System.out.print("| idx : "+arr.get(i).get(j).idx + " cost :" + arr.get(i).get(j).cost+"| ");
			}
			System.out.println();
		}
	}
	
	/*
//	graph  => array[Node] 로 만든다.
	dist[]  ==> 정점 노드에서 다음노드까지의 거리(0,1,30) 
	 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertexCnt = sc.nextInt();
		int line = sc.nextInt();
		//graph arrayList<arrayList<Node>> 생성
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
		// 각 정점별로 arrayList 하나씩 만들꺼기 때문에 arrayList 생성
		for(int i=0;i<vertexCnt;i++) {
			graph.add(new ArrayList<>());
		}
		//간선 이어주기 작업 시작
		for(int i=0; i<line;i++) {
			int vertex = sc.nextInt();
			int next   = sc.nextInt();
			int cost   = sc.nextInt();
			graph.get(vertex).add(new Node(next,cost));
			graph.get(next).add(new Node(vertex,cost));
		}
		//거리 배열을 초기화시킨다.
		int dist[] = new int[vertexCnt];
		for(int i=0; i<dist.length;i++) dist[i] = Integer.MAX_VALUE;
		
		//어떤 노드부터 시작할지 받아서, 그 노드는 dist배열에 0으로 초기화
		int start = sc.nextInt();
		dist[start] = 0;
		boolean visited[] = new boolean[vertexCnt];
		System.out.println(Arrays.toString(dist));
		show(graph);
		
		//dijkstra 알고리즘 수행
		//근처노드 최단거리 찾는작업 시작
		for(int i=0;i<vertexCnt;i++) {
			//1. 현재 거리 비용 중 최소인 지점을 선택한다.
		    // 해당 노드가 가지고 있는 현재 비용.
			int min = Integer.MAX_VALUE;
			// 해당 노드의 인덱스(번호)
			int nodeIdx = -1;
			for(int j=0;j<vertexCnt;j++) {
				// 해당 노드를 방문하지 않았고, 현재 모든 거리비용 중 최솟값을 찾는다.
				if(dist[j]<min && !visited[j]) {
					min = dist[j];
					nodeIdx = j;
				}
			}
			
			//해당 노드를 방문처리 한다.
			visited[nodeIdx] = true;
			for(int j=0;j<graph.get(nodeIdx).size();j++) {
				Node curNode = graph.get(nodeIdx).get(j); //인접노드와 비교할노드를 뽑는다.
				// 인접 노드가 현재 가지는 최소 비용과
				// 현재 선택된 노드의 값 + 현재 노드에서 인접 노드로 가는 값을 비교하여 더 작은 값으로 갱신한다.
				if(dist[nodeIdx]+ curNode.cost < dist[curNode.idx]) {
					dist[curNode.idx] = dist[nodeIdx]+ curNode.cost;
				}
			}
		}
		
		System.out.println(Arrays.toString(dist));
		
	}
}