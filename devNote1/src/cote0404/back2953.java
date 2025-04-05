package cote0404;

import java.util.Scanner;

public class back2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] data = new int[5][4];
		int []sum = new int[5];
		int max = Integer.MIN_VALUE;
		int idx = 0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				data[i][j] = sc.nextInt();
				sum[i]+=data[i][j];
			}
			
			if(max < sum[i]) {
				max = sum[i];
				idx = i+1;
			}
		}
		
		System.out.println(idx + " " + max);
	}
}
