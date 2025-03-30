package sort;

public class SelectionSort {

	public static void selectSort(int data[]) {
		int i,j;  // 배열에 있는 원소들을 반복적으로 탐색하기위한 인덱스
		int min;  // 가장 작은 것을 선택하기위한 인덱스
        int index = 0; //가장 작은 원소의 인덱스
        
        for(i=0;i<data.length;i++) {
        	min = 9999;
        	for(j=i;j<data.length;j++) { 
        		if(min > data[j]) { // 탐색하고있는 원소가, 현재 최솟값보다 더 작다면
        			min = data[j]; // 그 원소로 바꿔준다.
        			index = j; // 인덱스 저장
        		}
        	}
        	swap(data, i , index);
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
		int array[] = {1,4,25,5,6,46,2,3};
		selectSort(array);
		printArray(array);
	}
	
}