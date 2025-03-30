package sort;

public class HeapSort {

	public static void heapSort(int[] data) {
		heapSort(data,data.length);
	}
	public static void heapSort(int[] data, int size) {
		if(size < 2) return; 
		for(int i=size-1; i >= 0; i--) { // 1�� heapify
			heapfiy(data,i,size);
		}
		
		for(int i=size-1; i>0;i--) { //�ִ����� ����� ��������� heapify
			swap(data,0,i);
			heapfiy(data,0,i);
		}
	}
	
	public static void heapfiy(int[] data, int parentIdx, int size) {
		int leftIdx  = parentIdx * 2 + 1; //�ڽ��� ����idx
		int rightIdx = leftIdx +1;        //�ڽ��� ������idx
		int largeIdx;                     //���߰��� ū idx
		
		if(leftIdx < size && data[leftIdx] > data[rightIdx]) { //����idx�� ����� �ѱ����ʰ�, ���ʰ��� ũ�� largeidx�� �����ε���
			largeIdx = leftIdx;
		}else if(rightIdx < size && data[leftIdx] < data[rightIdx]) {//������idx�� ����� �ѱ����ʰ�, �����ʰ��� ũ�� largeidx�� �������ε���
			largeIdx = rightIdx;
		}else { // largeIdx�� ����ó���� �̷������������ swap, ��� ���ʿ� �����Ƿ� �ε����� -1�� �ʱ�ȭ
			largeIdx = -1;
		}
		if(largeIdx != -1 && data[largeIdx] > data[parentIdx]) {// �ڽ��� ��尪�� �θ��� ��尪���� ũ�ٸ� ������ heapify ���ȣ��
			swap(data,largeIdx,parentIdx);
			heapfiy(data, largeIdx, size-1);
		}
	}
	
	public static void swap(int data[], int i , int j) {
		int temp; // swap �ϱ� ����  temp ������
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
