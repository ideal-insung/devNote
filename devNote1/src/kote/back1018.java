package kote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW


10 13
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB

9 23
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBW

11 12
BWWBWWBWWBWW
BWWBWBBWWBWW
WBWWBWBBWWBW
BWWBWBBWWBWW
WBWWBWBBWWBW
BWWBWBBWWBWW
WBWWBWBBWWBW
BWWBWBWWWBWW
WBWWBWBBWWBW
BWWBWBBWWBWW
WBWWBWBBWWBW
*/

public class back1018 {
	
	public static int searchMinimumCnt(char[][] chess, int i, int j) {
		int b_cnt = 0;
		for(int x = i; x<i+8;x++) {
			for(int y=j; y<j+8;y++) {
				if((x+y)%2 == 0 && chess[x][y] == 'B') {
					b_cnt++;
				}else if((x+y)%2 == 1 && chess[x][y] == 'W') {
					b_cnt++;
				}
			}
		}
		return Math.min(b_cnt, 64-b_cnt);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] chess = new char[N][M];
		
		for(int i=0; i<N;i++) {
			String line = br.readLine();
			chess[i] = line.toCharArray();
		}
		
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		for(int i=0;i<=N-8;i++) {
			for(int j=0; j<=M-8;j++) {
				cnt = searchMinimumCnt(chess,i,j);
				min = Math.min(cnt, min);
			}
		}
		System.out.println(min);
	}
}
