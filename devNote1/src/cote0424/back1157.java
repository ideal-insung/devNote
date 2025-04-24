package src.cote0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char []arr = br.readLine().toCharArray();
        for(int i=0;i<arr.length;i++){
            arr[i] = Character.toUpperCase(arr[i]);
        }

        int []arrN = new int[26];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arrN.length;j++){
                if((int)arr[i]-65 == j){
                    arrN[j]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        int idx = 0;
        for(int i=0;i<arrN.length;i++){
            if(max < arrN[i]){
                max = arrN[i];
                idx = i;
            }
        }

        for(int i=0;i<arrN.length;i++){
            if(arrN[i] == max){
                cnt ++;
            }
        }

        if(cnt == 1){
            System.out.println((char)(idx+65));
        }else{
            System.out.println("?");
        }
    }
}
