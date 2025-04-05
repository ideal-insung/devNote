package cote0403;

import java.util.Scanner;

/*
N= 5
첫 9
7
5
3
1
*/
public class back2443 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<2*N-1-i;j++) {
				if(i-j >= N-(N-1)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
