package sort;

public class BubbleSort {

	public static void bubbleSort(int[] data) {
		int i,j; // �迭�� �ִ� ���ҵ��� �ݺ������� Ž���ϱ����� �ε���
		for(i=0;i<data.length;i++) {
			for(j=0;j<data.length-1-i;j++) { //������ ũ�⸦ �ϳ��� �����ϸ鼭 for��
				if(data[j] > data[j+1]) { // ���ʿ��ִ°��� �����ʺ��� ũ�ٸ�,
					swap(data,j);
				}
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
		int array[] = {1,4,25,5,6,46,2,3};
		bubbleSort(array);
		printArray(array);
	}
}
