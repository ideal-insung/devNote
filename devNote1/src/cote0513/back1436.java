package src.cote0513;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class back1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int idx = 666;
        int cnt = 0;
        while(cnt < n){
            String s = String.valueOf(idx);
            if(s.contains("666")){
                cnt ++;
            }
            idx ++;
        }

        System.out.println(idx -1);
    }
}
