package src.cote0414;

import java.util.Scanner;

public class back2921 {
    public  static  int getCnt(int n){
        if(n<0) return -1;
        if(n==1) return 3;
        return getCnt(n-1)+ (n*(n+1))/2 + n*(n+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = getCnt(n);
        System.out.println(sum);

    }
}
