package src.cote0414;

import java.util.Scanner;

public class back4504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(true){
            int data = scanner.nextInt();
            if(data == 0 ) break;
            if(data % n ==0){
                System.out.println(data +" is a multiple of "+n +".");
            }else{
                System.out.println(data +" is NOT a multiple of "+n+".");
            }
        }
    }
}
