package cote0402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
10개씩 끊어 출력하기
*/
public class back11721 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		int add = 10;
		String a[] = new String[text.length()/add+1];
		a[0] = text.substring(0,add);
		for(int i=0;i<a.length;i++) {
			if(i == a.length-1) {
				a[i] = text.substring(i*add);
				break;
			}
			a[i] = text.substring(i*add,(i+1)*add);
			
			for(String b:a) {
				System.out.println(b);
			}
		}
	}
}
