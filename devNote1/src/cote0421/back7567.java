package src.cote0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = br.readLine().toCharArray();
        int size = 10;

        char before =arr[0];
        for(int i=1;i<arr.length;i++){
            char now = arr[i];
            if(before == now) size +=5;
            else size +=10;
            before = now;
        }
        System.out.println(size);
    }
}
