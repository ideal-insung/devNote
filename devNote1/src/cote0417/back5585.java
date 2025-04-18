package src.cote0417;

import java.util.Scanner;

public class back5585 {
    static int cnt = 0;
    public static int devide(int n){
        if(n == 0) return n;
        if(n >= 500){
            cnt++;
            return devide(n-500);
        }else if(n<500 && n >=100){
            cnt++;
            return devide(n-100);
        }else if(n <100 && n>=50){
            cnt++;
            return devide(n-50);
        }else if(n<50 && n>=10){
            cnt++;
            return devide(n-10);
        }else if(n < 10 && n>=5){
            cnt++;
            return devide(n-5);
        }else{
            cnt++;
            return devide(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int giveP = 1000;
        devide(giveP - price);
        System.out.println(cnt);
    }
}
