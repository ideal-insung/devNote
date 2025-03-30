package kote;

import java.util.Scanner;

/*
자연수 m이 있을때, m의 분해합: n
m을 n의 생성자
ex)256(=245+2+4+5) 245는 256의 생성장

N = x의 첫번째자리값 + x두번째 자리값 + x세번째 자리값 + x

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
