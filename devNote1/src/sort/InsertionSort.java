package sort;

public class InsertionSort {

	public static void insertSort(int data[]) {
		int i,j; // 배열에 있는 원소들을 반복적으로 탐색하기위한 인덱스
		for(i=0;i<data.length-1;i++) {
			j=i; //현재 정렬할  그 원소를 선택해서 적절한 위치에 삽입할수 있도록
			while(j >= 0 && data[j] > data[j+1]) { // 왼쪽에있는값이 오른쪽에있는값과 더 크다면,
				swap(data, j);
				j--;
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
		int array[] = {6,3,4,1,5,2};
		insertSort(array);
		printArray(array);
	}
}
