package src.cote0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []txt = br.readLine().split("-");
        for(int i=0;i<txt.length;i++){
            System.out.print(txt[i].charAt(0));
        }
    }
}
