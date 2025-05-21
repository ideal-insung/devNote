package src.cote0519;

import java.util.Scanner;

public class back14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = exchange(n);
        System.out.println(cnt);
    }

    private static int exchange(int n) {
        int cnt = 0;
        int moks = n/5;
        int namuge = n%5;
        if(n<5 && (n%2 != 0)) return -1;
        if(namuge%2 != 0){
            moks-=1;
            namuge = namuge+5;
        }

        cnt = moks + (namuge/2);
        return cnt;
    }
}
