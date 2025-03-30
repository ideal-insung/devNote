package sort;

public class QuickSort {
	public static void quickSort(int[] data) {
		quickSort(data , 0 , data.length-1);
	}
	
	public static void quickSort(int[] data, int start , int end) {
		int part = partitionBy(data,start,end); //2번째 파티션의 첫번째 스타트값
		if(start < part -1) { //파티션 나눈다
			quickSort(data, start, part-1);
		}
		if(part < end) {
			quickSort(data, part, end);
		}
	}
	
	public static int partitionBy(int[] data, int start, int end) {
		int pivot = data[(start+end)/2]; // 시작과 끝을 더하고, 2를 나눠서 중간지점 계산
		while(start <= end) { // 시작점이 끝지점보다 작거나 같은동안만 반복
			while(data[start] < pivot) start ++; //스타트포인트부터 피벗값보다 작으면 무시
			while(data[end] > pivot) end --;     //엔드포인트부터 배열방의 값이 피벗값 크면 무시
			if(start <= end) { //서로 만났는지 확인후 스왑
				swap(data,start,end);
				start ++ ; //오른쪽으로 포인터이동
				end --; //왼쪽으로 포인터이동
			}
		}
		return start;
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
		int []data = {5,1,6,3,4,2,7};
		quickSort(data);
		printArray(data);
	}
	
}