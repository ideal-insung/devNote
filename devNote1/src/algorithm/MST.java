package algorithm;

import java.util.ArrayList;
import java.util.Collections;

/*
UnionFind �˰��� �����н� �ʿ�
�ش� �迭�� ��ǥ���� �ε����� ���� ���������� ����(������ �Ǿ��ִٸ� �׷�����)
 
MST �ּҽ���Ʈ��
����n���������� �ּҷ� �����Ҽ��ִ� ������ ������ n-1 
edge �迭��ü�� �Ѱܹ޾Ƽ�, �� �׷����� �Ѱܹ޾Ƽ�, cost�� ���� �����͵���� �������� ���Ľ����ְ�,
�׷����� �������� ������ �����ϴµ�, cycle�� �Ǹ� �ȵǹǷ�, isConnect�Լ��� ���Ϲ޾� cycle�� �ǰԵǸ� break;
�׷��������� �����迭��ü�� ���Ϲ޾Ƽ�, cost�� �հ踦 ���Ѵ�.
*/
public class MST {
   
	int prvNum[];
	ArrayList<Edge> arr;
	ArrayList<Edge> returnArr;
	int sum;
	int vecrtexCnt;
	int line;
	
	public MST(ArrayList<Edge> array ,int vecrtexCnt , int line) { //�迭���� �ε����� ŭ�� ���� �ʱ�ȭ
		prvNum = new int[vecrtexCnt+1];
		for(int i = 1; i<vecrtexCnt+1;i++) {
			prvNum[i] = i;
		}
		this.arr       = array;
		this.line      = line;
		this.vecrtexCnt = vecrtexCnt;
		this.sum = 0;
	}
	

	
	public void union(int x, int y) {
		x = find(x);
		y = find(y);
		if(x < y) { //������ x�� ��Եȴٸ�
			prvNum[y] = x;
		}else {
			prvNum[x] = y; 
		}
	}
	
	public int find(int x) {
		if(prvNum[x] == x) return x;
		else return prvNum[x] = find(prvNum[x]);
	}
	
	public boolean isConnect(int x, int y) {
		x = find(x);
		y = find(y);
		if(x == y) return true;
		else return false;
	}
	
	//���� -1 ������ ���� �Լ��� �����Ų��.
	public ArrayList<Edge> MinimumSpanningTree(){
		returnArr = new ArrayList<Edge>();
		//����Ʈ�� �ϴ� ������cost���� �������� ������ ��Ų��.
		Collections.sort(arr);
		System.out.println();
		for(int i=0; i<arr.size()-1;i++) {
			Edge currntEdge = arr.get(i);
			while(!isConnect(currntEdge.x, currntEdge.y)) {
				union(currntEdge.x, currntEdge.y);
				returnArr.add(currntEdge);
			}
		}
		return returnArr;
	}
	
	public void showArr() {
		for(Edge i: returnArr) {
			sum += i.cost;
			System.out.println("x :" + i.x +"|y:"+i.y +"|cost : "+ i.cost);
		}
		System.out.println(sum);
	}
}
