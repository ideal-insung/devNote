package cote_0401;

import java.util.Arrays;
import java.util.Scanner;

/*
세 변의 길이로 직각삼각형인지 아닌지 알아내라
각 입력이 맞다면 right 아니면 false 출력

6 8 10
25 52 60
5 12 13
0 0 0

*/
public class back4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int b = sc.nextInt();
			int a = sc.nextInt();
			int c = sc.nextInt();
			if(a ==0 && b==0 && c == 0) {
				sc.close();
				break;
			}
			if(a*a + b*b == c*c) {
				System.out.println("right");
			}else if(a*a + c*c == b*b) {
				System.out.println("right");
			}else if(b*b+c*c == a*a) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
}
