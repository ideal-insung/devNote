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
		
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>(); // �׷����� �������ְ�
		for(int i=0; i<vertexCnt;i++) graph.add(new ArrayList<>()); // ������ ������ŭ �׷����� ��̸� �����Ѵ�.
		
		for(int i=0; i<line;i++) { //�ش� �������� �մ��۾� �� �ʿ�!
			st = new StringTokenizer(br.readLine());
			int vertex = Integer.parseInt(st.nextToken());
			int next   = Integer.parseInt(st.nextToken());
			int cost   = Integer.parseInt(st.nextToken());
			
			graph.get(vertex).add(new Node(next, cost));// ������ �̾��ִ��۾�
			graph.get(next  ).add(new Node(vertex, cost)); //������ �׷����̹Ƿ� �Ѵټ���
		
		}
		
		int []distance = new int[vertexCnt]; //�Ÿ��ǰ��� �����Ҽ��ִ� �迭�� ����
		for(int i=0;i<vertexCnt;i++) distance[i] = Integer.MAX_VALUE; // ���δ� �ִ밪���� �ٲ��ְ�,
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken()); //start���� �����Ŀ� 
		distance[start] = 0; // �ش� ��ŸƮ���� 0���� �������ش�.
		
		boolean visited[] = new boolean[vertexCnt]; //�湮üũ �迭�� ������ش�.
		
		//���� ť�� ���� ���ͽ�Ʈ�� ����!
		PriorityQueue<Node> que = new PriorityQueue<>();
		que.offer(new Node(start, 0));
		System.out.println(Arrays.toString(distance));
		
		while(!que.isEmpty()) {
			Node curNode = que.poll();
			if(visited[curNode.idx]) continue;
			
			visited[curNode.idx] = true;
			//�����带 �̾Ƽ� �������ִ� ����� cost���� �����ش�. distance �迭�� ���� �� for���� �������Ѵ�. 
			//���ŭ? -> �����帮��Ʈ�� �����ŭ
			for(int i= 0; i< graph.get(curNode.idx).size();i++) { // nextNode���������� �Ѵ�.
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
