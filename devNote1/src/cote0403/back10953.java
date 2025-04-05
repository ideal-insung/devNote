package cote0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
A+B
5
1,3
2,3
3,4
9,8
5,2

2
5
7
17
7

*/
public class back10953 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a[] = new int[2];
		int N = Integer.parseInt(st.nextToken());
			
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			a[0] = Integer.parseInt(s.split(",")[0]);
			a[1] = Integer.parseInt(s.split(",")[1]);
			System.out.println(a[0]+a[1]);
		}
	}
}
