package cote0403;

import java.util.Arrays;
import java.util.Scanner;

/*
공 넣기
N개 바구니, M번

5 4 
1 2 3 
3 4 4 
1 4 1
2 2 2 

1 2 1 1 0
*/
public class back10810 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ball[] = new int [N];
		
		for(int i=0;i<M;i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int num = sc.nextInt();
			
			for(int j=from-1;j<=to-1;j++) {
				ball[j] = num;
			}
		}
		
		System.out.print(ball[0]);
		for(int i=1;i<ball.length;i++) {
			System.out.print(" "+ball[i]);
		}
	}
}
