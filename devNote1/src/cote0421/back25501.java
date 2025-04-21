package src.cote0421;

import java.util.Scanner;

public class back25501 {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ;i<n;i++){
            String s = sc.next();

            int a = isPalindroms(s);
            System.out.println(a + " "+ cnt);
            cnt = 0;
        }
    }

    private static int isPalindroms(String s) {
        return recursion(s,0,s.length()-1);
    }

    private static int recursion(String s, int l, int r) {
        cnt ++;
        if(l>=r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s,l+1,r-1);

    }
}
