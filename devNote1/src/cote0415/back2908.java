package src.cote0415;

import java.util.Scanner;

public class back2908 {
    public  static int calculate(int n){
        int []arr =new int [3];
        arr[0] = n%10;
        arr[1] = n/10%10;
        arr[2] = n/100;

        return arr[0]*100+arr[1]*10+arr[2];
    }
    public static int biggest(int n , int m){
        int big = 0;
        if(calculate(n) < calculate(m)){
            big = calculate(m);
        }else{
            big = calculate(n);
        }
        return big;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int res = biggest(n,m);
        System.out.println(res);

    }
}
