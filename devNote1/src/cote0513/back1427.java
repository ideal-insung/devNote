package src.cote0513;

import java.util.Arrays;
import java.util.Scanner;

public class back1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        char[]arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        for(char a :  arr){
            sb.append(a);
        }

        sb.reverse();

        System.out.println(sb);

    }
}
