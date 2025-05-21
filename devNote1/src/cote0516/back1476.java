package src.cote0516;

import java.util.Scanner;

public class back1476 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        isRight(e,s,m);
    }

    private static void isRight(int e, int s, int m) {
        int num =0 ;
        while(true){
            if((num-1)%15+1 == e && (num-1)%28+1 == s && (num-1)%19+1 == m){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
