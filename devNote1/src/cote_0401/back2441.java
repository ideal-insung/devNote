package cote_0401;

import java.util.Scanner;

public class back2441 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i>=j) System.out.println("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
