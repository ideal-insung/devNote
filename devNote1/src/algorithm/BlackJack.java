package algorithm;

import java.util.Scanner;

/*
ī�� N���� M�� ���� ����� ���� �̴� 
���� ���� 

 */
public class BlackJack {
	public static int blackJack(int[]cards, int count, int target) {
		int sum = 0;
		int tmp = 0;
		int min = 0;
		if(cards == null) return -1;
		for(int i=0;i<count-2;i++) { //0,1,2
			for(int j=i+1; j< count-1; j++) { //1,2,3
				for(int z = j+1; z< count; z++) { //2,3,4�ε���
					if(cards[i]+cards[j]+cards[z] == target) {
						sum = cards[i]+cards[j]+cards[z];
						return sum;
					}
					tmp = cards[i]+cards[j]+cards[z];
					if(tmp < target && min < tmp) {
						min = tmp;
					}
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int []arr = new int[N];
		for(int i=0; i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int a = blackJack(arr,N,M);
		System.out.println(a);
	}
}
