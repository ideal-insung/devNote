package kote;

import java.util.Scanner;

/*

216
198

*/
public class back2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		for(int i=0; i < N; i++) {
			int a = i;
			int sum = 0;
			while(a != 0) {
				sum +=a%10;
				a = a/10;
			}
			if(i + sum == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
