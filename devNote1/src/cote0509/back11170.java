package src.cote0509;

import java.util.Scanner;

public class back11170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int from = sc.nextInt();
            int to = sc.nextInt();

            getCnt(from , to);
        }
    }

    private static void getCnt(int from, int to) {
        int cnt = 0;
        for(int i=from;i<=to;i++){
            String s = String.valueOf(i);
            for(char c : s.toCharArray()){
                if(c == '0') cnt ++;
            }
        }

        System.out.println(cnt);

    }
}
