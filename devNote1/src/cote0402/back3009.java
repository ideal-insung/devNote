package cote0402;

import java.util.Scanner;

/*
각 축에 평행인 직사각형의 4번째 좌표를 구하라

*/
public class back3009 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x_1 = sc.nextInt();
		int y_1 = sc.nextInt();
		int x_2 = sc.nextInt();
		int y_2 = sc.nextInt();
		int x_3 = sc.nextInt();
		int y_3 = sc.nextInt();
		
		int x_4 = 0;
		int y_4 = 0;
		
		if(x_1 == x_2) {
			x_4 = x_3;
		}else if(x_1 == x_3) {
			x_4 = x_2;
		}else {
			x_4 = x_1;
		}
		
		if(y_1 == y_2) {
			y_4 = y_3;
		}else if(y_1 == y_3) {
			y_4 = y_2;
		}else {
			y_4 = y_1;
		}
		
		System.out.println(x_4 + " " +y_4);
	}
}
