package src.cote0408;

import java.util.Scanner;

public class back2476 {
    public static int maxMoney(int a, int b, int c){
        int max=0;
        if(a == b && b==c){
            max = 10000+(a*1000);
        }else if(a==b && a!=c && b!=c){
            max = 1000+(a*100);
        }else if(a==c && a!=b && b!=c){
            max = 1000+(a*100);
        }else if(b==c && a!=b && a!=c){
            max = 1000+(b*100);
        }else{
            if(a>b && a>c){
                max = 100*a;
            }else if(b>a && b>c){
                max = 100*b;
            }else{
                max = 100*c;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] arr = new int[N];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int money = maxMoney(a, b, c);
            max = Math.max(max, money); // 최댓값 업데이트
        }
        System.out.println(max);
    }
}
