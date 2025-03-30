package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class decimal {
/*
에라토스테네스의 체 알고리즘
배열을 1부터 N까지 만든다.
1을 제외하고, 2부터 n까지의 곱을 전부다 지운다.
  
*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		boolean isPrime[] = new boolean [N+1];
		
		isPrime[0] = true;
		isPrime[1] = true;
		for(int i=2; i<Math.sqrt(N);i++) {
			if(!isPrime[i]) {
				for(int j=i*i;j<=N;j+=i) {
					isPrime[j] = true;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			if(!isPrime[i]) {
				System.out.println(i);
			}
		}
	}
}
