package cote_0401;

import java.util.Arrays;
import java.util.Scanner;

/*
세 변의 길이로 직각삼각형인지 아닌지 알아내라
각 입력이 맞다면 right 아니면 false 출력

6 8 10
25 52 60
5 12 13

*/
public class back4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int []a = new int[3];
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			a[2] = sc.nextInt();
			
			Arrays.sort(a);
			
			if(i == 3) break;
			if(a[2]*a[2] == a[1]*a[1] + a[0]*a[0]) System.out.println("right");
			else System.out.println("wrong");
		}
	}
}
