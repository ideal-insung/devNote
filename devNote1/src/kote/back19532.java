package kote;

import java.util.Scanner;

/*
ax+by=c
dx+ey=f
-999~ ~ 999

 1 3 -1 4 1 7
 2 -1
 
 2 5 8 3 -4 -11
 -1 2
*/
public class back19532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int v_x = (c*e - f*b) / (a*e - b*d);
		int v_y = (c*d - a*f) / (b*d - a*e);
		
		System.out.println(v_x + " " +v_y);
	}
}
