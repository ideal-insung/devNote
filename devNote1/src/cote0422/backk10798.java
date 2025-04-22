package src.cote0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backk10798 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char arr[][] =new char[5][15];
        for(int i=0;i<5;i++){
            for(int j=0;j<15;j++){
                arr[i][j] = '*';
            }
        }

        for(int i=0;i<5;i++){
            char s[] = br.readLine().toCharArray();
            for(int j=0;j<s.length;j++){
                arr[i][j] = s[j];
            }
        }

        for(int j=0;j<15;j++){
            for(int i=0;i<5;i++){
                if(arr[i][j] != '*'){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}
