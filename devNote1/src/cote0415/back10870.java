package src.cote0415;

import java.util.Scanner;

public class back10870 {
    public static int f_fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return f_fibo(n-1) + f_fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int getPoint = f_fibo(n);
        System.out.println(getPoint);
    }
}
