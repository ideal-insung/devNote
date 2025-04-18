package src.cote0407;

import java.util.Scanner;

public class back2460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int station = 10;
        int max = Integer.MIN_VALUE;
        int []arr = new int[station];
        for(int i=1;i<station;i++){
            int out = scanner.nextInt();
            int in = scanner.nextInt();
            arr[i] = arr[i-1] - out + in;

            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
