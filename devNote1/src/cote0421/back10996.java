package src.cote0421;

import java.util.Scanner;

public class back10996 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<2*n;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0){
                    System.out.print("*");
                }else if(((i+j)%2 == 1) && j< n-1 ){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
