package src.cote0422;

import java.util.Scanner;

public class back2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] fibo = new long[n+1];

        fibo[0] = 0;
        if(n>0) fibo[1] = 1;

        for(int i=2;i<=n;i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }

        System.out.println(fibo[n]);
    }



}
