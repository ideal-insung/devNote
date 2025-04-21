package src.cote0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back10820 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
        int []arr = new int[4];
            char[] txt = line.toCharArray();
            for(char c : txt){
                if(Character.isLowerCase(c)){
                    arr[0]++;
                }else if(Character.isUpperCase(c)){
                    arr[1]++;
                }else if(Character.isDigit(c)){
                    arr[2]++;
                }else if(Character.isWhitespace(c)){
                    arr[3]++;
                }
            }

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
                arr[i] = 0;
            }
            System.out.println();
        }
    }
}
