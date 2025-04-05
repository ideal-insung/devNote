package cote0404;

import java.util.Scanner;

/*
ABC 각각의 횟수 누르지않으면 0
T초를 맞출수 없다면 -1

100
0 1 4

189
-1
*/
public class back10162 {
	static int abc[] = new int[3];
	
	public static int pressbt(int N) {
		int A = 300;
		int B = 60;
		int C = 10;
		
		if(N>=A) {
			abc[0]++;
			return pressbt(N-A);
		}else if(N>=B) {
			abc[1]++;
			return pressbt(N-B);
		}else if(C<=N && N<=B) {
			abc[2]++;
			return pressbt(N-C);
		}else {
			if(N == 0) return N;
			else       return -1;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int press = pressbt(N);
		
		if(press == -1) System.out.println(press);
		else System.out.println(abc[0]+" " + abc[1]+" " +abc[2]);
	}
}
