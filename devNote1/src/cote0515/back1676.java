package src.cote0515;

import java.util.Scanner;

public class back1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=5;i<=n;i*=5){
            cnt = cnt +n/i;
        }
        System.out.println(cnt);
    }
}
