package sort;

public class HeapSort {

	public static void heapSort(int[] data) {
		heapSort(data,data.length);
	}
	public static void heapSort(int[] data, int size) {
		if(size < 2) return; 
		for(int i=size-1; i >= 0; i--) { // 1차 heapify
			heapfiy(data,i,size);
		}
		
		for(int i=size-1; i>0;i--) { //최대힙을 만들고 나머지들로 heapify
			swap(data,0,i);
			heapfiy(data,0,i);
		}
	}
	
	public static void heapfiy(int[] data, int parentIdx, int size) {
		int leftIdx  = parentIdx * 2 + 1; //자식의 왼쪽idx
		int rightIdx = leftIdx +1;        //자식의 오른쪽idx
		int largeIdx;                     //둘중가장 큰 idx
		
		if(leftIdx < size && data[leftIdx] > data[rightIdx]) { //왼쪽idx는 사이즈를 넘기지않고, 왼쪽값이 크면 largeidx는 왼쪽인덱스
			largeIdx = leftIdx;
		}else if(rightIdx < size && data[leftIdx] < data[rightIdx]) {//오른쪽idx는 사이즈를 넘기지않고, 오른쪽값이 크면 largeidx는 오른쪽인덱스
			largeIdx = rightIdx;
		}else { // largeIdx의 변경처리가 이루어지지않으면 swap, 재귀 할필요 없으므로 인덱스를 -1로 초기화
			largeIdx = -1;
		}
		if(largeIdx != -1 && data[largeIdx] > data[parentIdx]) {// 자식의 노드값이 부모의 노드값보다 크다면 스왑후 heapify 재귀호출
			swap(data,largeIdx,parentIdx);
			heapfiy(data, largeIdx, size-1);
		}
	}
	
	public static void swap(int data[], int i , int j) {
		int temp; // swap 하기 위한  temp 데이터
		temp    = data[i]; 
		data[i] = data[j]; 
		data[j] = temp;
	}
	
	public static void printArray(int data[]) {
		for(int a : data) {
			System.out.print(a+",");
		}
	}
	
	public static void main(String[] args) {
		int []data = {4,2,1,7,5,6,8};
		heapSort(data);
		printArray(data);
	}
}
