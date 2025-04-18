package src.cote0409;

import java.util.Scanner;

public class back10995 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                    if(j!=n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
