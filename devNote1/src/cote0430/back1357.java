package src.cote0430;

import java.util.Scanner;

public class back1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int x = reverse(n);
        int y = reverse(m);
        int sum = x+y;
        int rslt = reverse(sum);
        System.out.println(rslt);
    }
    public static int reverse(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
