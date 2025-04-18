package src.cote0414;

import java.util.Scanner;

public class back9295 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1;i<n+1;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int ssum = a+b;

            System.out.println("Case " + i + ": " + ssum);
        }
    }
}
