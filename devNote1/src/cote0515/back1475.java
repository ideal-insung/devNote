package src.cote0515;

import java.util.Collections;
import java.util.Scanner;

public class back1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] count = new int[10];
        int cnt = 1;
        while(n>0){
            int dig = n%10;
            count[dig]++;
            n = n/10;
        }

        int a = (count[6]+count[9] + 1) / 2;
        count[6] = a;
        count[9] = a;

        int max = 0;
        for(int i=0;i<count.length;i++){
            if(count[i] > max){
                max = count[i];
            }
        }
        System.out.println(max);
    }
}
