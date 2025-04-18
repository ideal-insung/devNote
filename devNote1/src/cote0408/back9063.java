package src.cote0408;

import java.util.Scanner;

public class back9063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int x_max = Integer.MIN_VALUE;
        int x_min = Integer.MAX_VALUE;
        int y_max = Integer.MIN_VALUE;
        int y_min = Integer.MAX_VALUE;

        for(int i=0;i<N;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(x_max < x){
                x_max = x;
            }

            if(y_max < y){
                y_max = y;
            }

            if(x_min > x){
                x_min = x;
            }
            if(y_min > y){
                y_min = y;
            }
        }

        System.out.println((x_max - x_min) * (y_max - y_min));
    }
}
