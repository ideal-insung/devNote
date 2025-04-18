package src.cote0409;

import java.util.Scanner;

public class back9610 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();;
        int q1=0,q2=0,q3=0,q4=0,axis=0;
        for(int i=0;i<n;i++){
            int dot1 = sc.nextInt();
            int dot2 = sc.nextInt();

            if (dot1 == 0 || dot2 == 0) {
                axis++;
            } else if (dot1 > 0 && dot2 > 0) {
                q1++;
            } else if (dot1 < 0 && dot2 > 0) {
                q2++;
            } else if (dot1 < 0 && dot2 < 0) {
                q3++;
            } else if (dot1 > 0 && dot2 < 0) {
                q4++;
            }
        }

        System.out.println("Q1: " + q1);
        System.out.println("Q2: " + q2);
        System.out.println("Q3: " + q3);
        System.out.println("Q4: " + q4);
        System.out.println("AXIS: " + axis);
    }
}
