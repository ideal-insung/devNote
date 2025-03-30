package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import algorithm.DIjkstra_Sequential.Node;

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
public class DIjkstra_Queue {
	public static class Node implements Comparable<Node>{
		int idx;
		int cost;
		
		public Node(int idx, int cost) {
			this.idx  = idx;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
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
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int vertexCnt = Integer.parseInt(st.nextToken());
		int line      = Integer.parseInt(st.nextToken());
		
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>(); // 그래프를 생성해주고
		for(int i=0; i<vertexCnt;i++) graph.add(new ArrayList<>()); // 정점의 개수만큼 그래프의 어레이를 생성한다.
		
		for(int i=0; i<line;i++) { //해당 정점들을 잇는작업 이 필요!
			st = new StringTokenizer(br.readLine());
			int vertex = Integer.parseInt(st.nextToken());
			int next   = Integer.parseInt(st.nextToken());
			int cost   = Integer.parseInt(st.nextToken());
			
			graph.get(vertex).add(new Node(next, cost));// 정점을 이어주는작업
			graph.get(next  ).add(new Node(vertex, cost)); //무방향 그래프이므로 둘다셋팅
		
		}
		
		int []distance = new int[vertexCnt]; //거리의값을 셋팅할수있는 배열을 생성
		for(int i=0;i<vertexCnt;i++) distance[i] = Integer.MAX_VALUE; // 전부다 최대값으로 바꿔주고,
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken()); //start값을 받은후에 
		distance[start] = 0; // 해당 스타트값을 0으로 셋팅해준다.
		
		boolean visited[] = new boolean[vertexCnt]; //방문체크 배열을 만들어준다.
		
		//이제 큐를 만들어서 다익스트라 실행!
		PriorityQueue<Node> que = new PriorityQueue<>();
		que.offer(new Node(start, 0));
		System.out.println(Arrays.toString(distance));
		
		while(!que.isEmpty()) {
			Node curNode = que.poll();
			if(visited[curNode.idx]) continue;
			
			visited[curNode.idx] = true;
			//현재노드를 뽑아서 인접해있는 노드들과 cost값을 비교해준다. distance 배열의 값과 즉 for문을 돌려야한다. 
			//몇개만큼? -> 현재노드리스트의 사이즈만큼
			for(int i= 0; i< graph.get(curNode.idx).size();i++) { // nextNode를꺼내서비교 한다.
				Node nextNode = graph.get(curNode.idx).get(i);
				if(distance[nextNode.idx] > distance[curNode.idx] + nextNode.cost ) {
					distance[nextNode.idx] = distance[curNode.idx] + nextNode.cost;
					que.offer(new Node(nextNode.idx, distance[nextNode.idx]));
				}
			}
		}
		System.out.println(Arrays.toString(distance));
		show(graph);
		
		
	}
}
