package cote_0401;
/*
6 2 10 3
1

1 1 5 5 
1 

653 375 1000 1000
347

161 181 762 375
161

min ->(x,y)가 축에 더 가까운지 꼭짓점쪽에 더 가까운지 비교
(0,6), (6,10) 비교후 x_min = 6,10
(0,2), (2,3)  비교후 y_min = 2,3 
최종 min
*/

import java.util.Scanner;

public class back1085 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int x_min = 0;
		if(w-x > x) {
			x_min =x;
		}else {
			x_min = w-x;
		}
		
		int y_min = 0;
		if(h-y > y) {
			y_min = y;
		}else {
			y_min = h -y;
		}
		System.out.println(Math.min(x_min, y_min));
	}
}
