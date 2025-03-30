package sort;

public class MergeSort {

	public static void mergeSort(int data[]) {
		mergeSort(data , 0 , data.length-1);
	}

	public static void mergeSort(int data[],int start , int end) {
		if(start < end) {
			int mid = (start+end)/2; //중간값
			mergeSort(data, start, mid); //첫번째 배열
			mergeSort(data, mid+1, end); //두번째 배열
			merge(data , start , mid , end); //merge함수
		}
	}
	
	public static void merge(int data[],int start , int mid ,int end) {
		int []tmp = new int[data.length];
		for(int i=start; i<= end; i++) { // tmp데이터에 기존데이터 삽입
			tmp[i] = data[i];
		}
		int part1 = start; // 첫번째배열의 start 
		int part2 = mid+1; // 두번째배열의 start 
		int index = start; // 배열에 저장할 index
		
		while(part1 <= mid && part2 <= end) { //첫번째 배열이 끝까지 돌거나, 두번째 배열이 끝까지 돌때
			if(tmp[part1] <= tmp[part2]) { // 두개의 배열방에서 첫번째값들을 비교해서 앞쪽이 작으면
				data[index] = tmp[part1]; // 저장할배열[index]에 저장후 
				part1 ++;                 // 뒤로포인터++
			}else {
				data[index] = tmp[part2]; 
				part2 ++;
			}
			index ++;
		}
		for(int i=0; i<=mid-part1; i++) { //두개중에 뒤쪽배열에 데이터가 남아있는경우 
			data[index +i] = tmp[part1 + i];
		}
	}
	
	public static void printArray(int data[]) {
		for(int a : data) {
			System.out.print(a+",");
		}
	}
	
	public static void main(String[] args) {
		int []data = {4,2,5,1,8,6,3,7};
		mergeSort(data);
		printArray(data);
	}
	
}