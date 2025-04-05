package cote0403;

import java.util.Scanner;

public class back2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0;i<=2*N-1;i++) {
			for(int j=0; j<=N;j++) {
				if(j-i < N-(N-1) && i+j <N+(N-1)) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
    }
}


// 5-> 4
// 7 ->6