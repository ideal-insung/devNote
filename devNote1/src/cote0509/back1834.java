package src.cote0509;

import java.util.Scanner;

public class back1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for(long i=0;i<n;i++){
            sum+=(n*i)+i;
        }

        System.out.println(sum);

    }
}
