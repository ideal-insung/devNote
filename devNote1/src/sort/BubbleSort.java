package sort;

public class BubbleSort {

	public static void bubbleSort(int[] data) {
		int i,j; // 배열에 있는 원소들을 반복적으로 탐색하기위한 인덱스
		for(i=0;i<data.length;i++) {
			for(j=0;j<data.length-1-i;j++) { //집합의 크기를 하나씩 감소하면서 for문
				if(data[j] > data[j+1]) { // 왼쪽에있는값이 오른쪽보다 크다면,
					swap(data,j);
				}
			}
		}
	}
	
	public static void swap(int data[], int i) {
		int temp; // swap 하기 위한  temp 데이터
		temp    = data[i]; 
		data[i] = data[i+1]; 
		data[i+1] = temp;
	}
	
	public static void printArray(int data[]) {
		for(int a : data) {
			System.out.print(a+",");
		}
	}
	public static void main(String[] args) {
		int array[] = {1,4,25,5,6,46,2,3};
		bubbleSort(array);
		printArray(array);
	}
}
