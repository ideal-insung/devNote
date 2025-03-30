package sort;

public class QuickSort {
	public static void quickSort(int[] data) {
		quickSort(data , 0 , data.length-1);
	}
	
	public static void quickSort(int[] data, int start , int end) {
		int part = partitionBy(data,start,end); //2��° ��Ƽ���� ù��° ��ŸƮ��
		if(start < part -1) { //��Ƽ�� ������
			quickSort(data, start, part-1);
		}
		if(part < end) {
			quickSort(data, part, end);
		}
	}
	
	public static int partitionBy(int[] data, int start, int end) {
		int pivot = data[(start+end)/2]; // ���۰� ���� ���ϰ�, 2�� ������ �߰����� ���
		while(start <= end) { // �������� ���������� �۰ų� �������ȸ� �ݺ�
			while(data[start] < pivot) start ++; //��ŸƮ����Ʈ���� �ǹ������� ������ ����
			while(data[end] > pivot) end --;     //��������Ʈ���� �迭���� ���� �ǹ��� ũ�� ����
			if(start <= end) { //���� �������� Ȯ���� ����
				swap(data,start,end);
				start ++ ; //���������� �������̵�
				end --; //�������� �������̵�
			}
		}
		return start;
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
		int []data = {5,1,6,3,4,2,7};
		quickSort(data);
		printArray(data);
	}
}
