package src.cote0430;

import java.util.Scanner;

public class back24416 {
    static int a = 0;
    static int b = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        code1(n);
        code2(n);
        System.out.println(a+1 + " " + b);
    }

    private static int code2(int n) {
        int []arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        for(int i=3;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        b = n-2;
        return arr[n];
    }

    private static int code1(int n) {
        if(n==1 || n==2) return 1;
        else {
            a++;
            return code1(n-1) + code1(n-2);
        }
    }
}
