package sort;

public class InsertionSort {

	public static void insertSort(int data[]) {
		int i,j; // �迭�� �ִ� ���ҵ��� �ݺ������� Ž���ϱ����� �ε���
		for(i=0;i<data.length-1;i++) {
			j=i; //���� ������  �� ���Ҹ� �����ؼ� ������ ��ġ�� �����Ҽ� �ֵ���
			while(j >= 0 && data[j] > data[j+1]) { // ���ʿ��ִ°��� �����ʿ��ִ°��� �� ũ�ٸ�,
				swap(data, j);
				j--;
			}
		}
	}
	public static void swap(int data[], int i) {
		int temp; // swap �ϱ� ����  temp ������
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
