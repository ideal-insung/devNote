package src.cote0409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back10102 {

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char []arr = br.readLine().toCharArray();

        int a_score = 0;
        int b_score = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'A') a_score ++;
            else b_score ++;
        }

        if(a_score > b_score) System.out.println("A");
        else if(a_score < b_score) System.out.println("B");
        else System.out.println("Tie");
    }
}
