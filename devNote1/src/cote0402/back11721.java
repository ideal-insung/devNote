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
		for(int i=0;i<text.length();i++) {
			if(i!=0 && i%10 == 0) {
				System.out.println();
			}
			System.out.print(text.charAt(i));
		}
	}
}
