package src.cote0528;

import java.util.Scanner;

public class back2839 {
    static int v_cnt1 = 0 ;
    static int v_cnt2 = 0 ;

    public static boolean v1(int n){
        boolean v1 = true;
        while(n>0){
            if(n >= 5){
                n = n-5;
                v_cnt1++;
            }else if(n>=3){
                n = n -3;
                v_cnt1++;
            }else{
                v1 = false;
                break;
            }
        }
        return v1;
    }

    public static boolean v2(int n){
        boolean v2 = true;
        while(n>0){
            if(n>=3){
                if(n%5 == 0){
                    n = n-5;
                    v_cnt2++;
                }else{
                    n = n-3;
                    v_cnt2++;
                }
            }else{
                v2 = false;
                break;
            }
        }
        return v2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(!v1(n)){
            v_cnt1 = -1;
        }

        if(!v2(n)){
            v_cnt2 = -1;
        }

        System.out.println(Math.max(v_cnt1,v_cnt2));
    }
}
