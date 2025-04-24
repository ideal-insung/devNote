package src.cote0424;

import java.util.Scanner;

public class back11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i == 0){
                System.out.println(i);
                n = n/i;
            }
        }

        if(n > 1){
            System.out.println(n);
        }
    }
}
