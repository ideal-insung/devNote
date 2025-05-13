package src.cote0512;

import java.util.Scanner;

public class back1527 {
    static int cnt = 0;
    static int n,m;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        isGeumMinSu(0);

        System.out.println(cnt);
    }

    private static void isGeumMinSu(long num) {
        if(num > m ) return;
        if(num >= n) cnt ++;
        isGeumMinSu(num *10 +4);
        isGeumMinSu(num *10 +7);
    }
}
