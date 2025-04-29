package src.cote0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class back11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] c = br.readLine().toCharArray();

        for(int i=0;i<c.length;i++){
            if(Character.isUpperCase(c[i])){
                int x = (int)c[i]+13;
                if(x>90) x = (x-90)+64;
                c[i] = (char)(x);
                System.out.print(c[i]);
            }else if(Character.isLowerCase(c[i])){
                int x = (int)c[i]+13;
                if(x>122) x = (x-122)+96;
                c[i] = (char)(x);
                System.out.print(c[i]);
            }else if(Character.isWhitespace(c[i])){
                System.out.print(" ");
            }else if(Character.isDigit(c[i])){
                System.out.print(c[i]);
            }
        }
    }
}
