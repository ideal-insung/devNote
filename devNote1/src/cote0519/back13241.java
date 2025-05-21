package src.cote0519;

import java.util.Scanner;

public class back13241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long gcd = GCD(n,m);

        System.out.println((n*m)/gcd);
    }

    private static long GCD(long n, long m) {
        if(m == 0) return n;
        return GCD(m,n%m);
    }
}
