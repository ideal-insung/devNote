package cote0404;

import java.util.Scanner;

public class back10991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N%2 == 0) {
			for(int i=0; i<N;i++) {
				for(int j=0;j<2*N-1;j++) {
					if(((i+j)%2 == 1 && i+j>N-2 ) && (i+j)%2 ==1 && j-i<N+1) {
						System.out.print("*");
					}else {
						//System.out.print(" ");
					}
				}
				System.out.println();
			}
		}else {
			for(int i=0;i<N;i++) {
				for(int j=0;j<2*N-1;j++) {
					if(((i+j)%2 == 0 && i+j>=N-2) &&((i+j)%2 ==0 && j-i <N+1)){
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
	}
}
