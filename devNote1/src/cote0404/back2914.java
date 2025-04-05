package cote0404;
/*
저작권
멜로디개수/ 수록곡개수
올림처리
적어도 몇곡이 저작권이 있는멜로디인지?
앨범수록곡, 평균값

38 24
875

1 100
100

10 10
91
*/

import java.util.Scanner;

public class back2914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int cnt = sc.nextInt();
	int avg = sc.nextInt();
	
	System.out.println(cnt*(avg-1)+1);
	}
}
