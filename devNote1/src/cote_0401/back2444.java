package cote_0401;

import java.util.Scanner;

/*
별찍기 5

input 5
*/
public class back2444 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i,j = 0;
		for(i=0;i<N-1;i++) {
			for(j=1;j<2*N;j++) {
				if(N-i <= j && j <= N+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(i=N-1; i>-1;i--) {
			for(j=1;j<2*N+1;j++) {
				if(N-i <= j && j <= N+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
