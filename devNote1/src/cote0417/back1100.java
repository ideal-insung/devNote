package src.cote0417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][]arr = new char[8][8];
        for(int i=0;i<arr.length;i++){
            String txt = br.readLine();
            arr[i] = txt.toCharArray();
        }

        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i+j)%2 == 0 && arr[i][j] =='F'){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
