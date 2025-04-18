package src.cote0409;

import java.util.Scanner;

public class back9325 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0;i<N;i++){
            int carPrice = scanner.nextInt();
            int option = scanner.nextInt();
            int sum = 0;
            for(int j=0;j<option;j++){
                sum+= scanner.nextInt() * scanner.nextInt();
            }
            sum+= carPrice;
            System.out.println(sum);
        }
    }
}
