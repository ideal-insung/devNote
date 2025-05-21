package src.cote0516;

import java.util.Scanner;

public class back9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(n>0){
            if(n-3 == 0 || n-1 == 0)break;
            if(n > 3) n = n-3;
            else n=n-1;
            cnt++;
        }
        String s = cnt%2==0? "SK" : "CY";
        System.out.println(s);
    }
}
