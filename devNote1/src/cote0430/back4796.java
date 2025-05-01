package src.cote0430;

import java.util.Scanner;

public class back4796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true){
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();

            if(l == 0 && p == 0 && v == 0){
                break;
            }
            i++;
            int sum = 0;
            int prevDay =(v/p*l);
            int dday = 0;
            if(v%p > l){
                dday = l;
            }else{
                dday = v%p;
            }
            sum = prevDay + dday;
            System.out.println("Case "+i+":" + sum);
        }

    }
}
