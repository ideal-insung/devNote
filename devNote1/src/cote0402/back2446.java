package cote0402;

import java.util.Scanner;

/*
별찍기
*/
public class back2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i,j;
		
		for(i=0;i<N;i++) {
			for(j=0;j<2*N-1-i;j++) {
				if(i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(i=1;i<N;i++) {
			for(j=0;j<N+i;j++) {
				if(i+j>=N-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
