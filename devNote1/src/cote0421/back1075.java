package src.cote0421;

import java.util.Scanner;

public class back1075 {
    public static int devide(int n,int f){
        n = n/100*100;
        int tmp = 0;
        for(int i=0;i<100;i++){
            if((n+i)%f == 0 ){
                tmp = n+i;
                break;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();

        int minDiv = devide(n,f);
        if(minDiv%100 < 10){
            System.out.println("0"+minDiv%100);
        }else{
            System.out.println(minDiv%100);
        }
    }
}
