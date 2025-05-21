package src.cote0516;

import java.util.Scanner;

public class back1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0 ;
        int cnt = 0;
        for(long i=1;;i++){
            if(sum+i > n) break;
            sum = sum+i;
            cnt ++;
        }
        System.out.println(cnt);

    }
}
