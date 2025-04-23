package src.cote0423;

import java.util.ArrayList;
import java.util.Scanner;
/*
gcd : 두수의 나머지를 r이라 칭하고, 두수의 작은값을 r과 계속 나눈다.
*/
public class back2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcd = getGCD(n,m);
        long lcm =  ((long) n * m) /gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int getGCD(int n, int m) {
        if(m == 0) return n;
        int tmp = n%m;
        return getGCD(m,tmp);
    }
}
