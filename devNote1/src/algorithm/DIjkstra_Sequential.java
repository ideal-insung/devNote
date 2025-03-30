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
//	graph  => array[Node] �� �����.
	dist[]  ==> ���� ��忡�� ������������ �Ÿ�(0,1,30) 
	 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertexCnt = sc.nextInt();
		int line = sc.nextInt();
		//graph arrayList<arrayList<Node>> ����
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
		// �� �������� arrayList �ϳ��� ���鲨�� ������ arrayList ����
		for(int i=0;i<vertexCnt;i++) {
			graph.add(new ArrayList<>());
		}
		//���� �̾��ֱ� �۾� ����
		for(int i=0; i<line;i++) {
			int vertex = sc.nextInt();
			int next   = sc.nextInt();
			int cost   = sc.nextInt();
			graph.get(vertex).add(new Node(next,cost));
			graph.get(next).add(new Node(vertex,cost));
		}
		//�Ÿ� �迭�� �ʱ�ȭ��Ų��.
		int dist[] = new int[vertexCnt];
		for(int i=0; i<dist.length;i++) dist[i] = Integer.MAX_VALUE;
		
		//� ������ �������� �޾Ƽ�, �� ���� dist�迭�� 0���� �ʱ�ȭ
		int start = sc.nextInt();
		dist[start] = 0;
		boolean visited[] = new boolean[vertexCnt];
		System.out.println(Arrays.toString(dist));
		show(graph);
		
		//dijkstra �˰��� ����
		//��ó��� �ִܰŸ� ã���۾� ����
		for(int i=0;i<vertexCnt;i++) {
			//1. ���� �Ÿ� ��� �� �ּ��� ������ �����Ѵ�.
		    // �ش� ��尡 ������ �ִ� ���� ���.
			int min = Integer.MAX_VALUE;
			// �ش� ����� �ε���(��ȣ)
			int nodeIdx = -1;
			for(int j=0;j<vertexCnt;j++) {
				// �ش� ��带 �湮���� �ʾҰ�, ���� ��� �Ÿ���� �� �ּڰ��� ã�´�.
				if(dist[j]<min && !visited[j]) {
					min = dist[j];
					nodeIdx = j;
				}
			}
			
			//�ش� ��带 �湮ó�� �Ѵ�.
			visited[nodeIdx] = true;
			for(int j=0;j<graph.get(nodeIdx).size();j++) {
				Node curNode = graph.get(nodeIdx).get(j); //�������� ���ҳ�带 �̴´�.
				// ���� ��尡 ���� ������ �ּ� ����
				// ���� ���õ� ����� �� + ���� ��忡�� ���� ���� ���� ���� ���Ͽ� �� ���� ������ �����Ѵ�.
				if(dist[nodeIdx]+ curNode.cost < dist[curNode.idx]) {
					dist[curNode.idx] = dist[nodeIdx]+ curNode.cost;
				}
			}
		}
		
		System.out.println(Arrays.toString(dist));
	}
}
