package algorithm;

import java.util.ArrayList;
import java.util.Collections;

/*
UnionFind 알고리즘 선행학습 필요
해당 배열의 대표값을 인덱스가 가장 작은값으로 수정(연결이 되어있다면 그래프가)
 
MST 최소신장트리
정점n개가있으면 최소로 연결할수있는 간선의 갯수는 n-1 
edge 배열객체를 넘겨받아서, 즉 그래프를 넘겨받아서, cost가 가장 작은것들부터 오름차순 정렬시켜주고,
그래프에 정점에서 간선을 연결하는데, cycle이 되면 안되므로, isConnect함수를 리턴받아 cycle이 되게되면 break;
그렇지않으면 엣지배열객체를 리턴받아서, cost의 합계를 구한다.
*/
public class MST {
   
	int prvNum[];
	ArrayList<Edge> arr;
	ArrayList<Edge> returnArr;
	int sum;
	int vecrtexCnt;
	int line;
	
	public MST(ArrayList<Edge> array ,int vecrtexCnt , int line) { //배열값에 인덱스만 큼의 값을 초기화
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
		if(x < y) { //기준을 x로 잡게된다면
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
	
	//정점 -1 개까지 돌때 함수를 종료시킨다.
	public ArrayList<Edge> MinimumSpanningTree(){
		returnArr = new ArrayList<Edge>();
		//리스트를 일단 데이터cost값에 오름차순 정렬을 시킨다.
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