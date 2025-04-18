package src.cote0414;

import java.util.Scanner;

public class back3034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        for(int i=0;i<N;i++){
            int val = scanner.nextInt();
            if(val > Math.sqrt(Math.pow(W,2) + Math.pow(H,2))){
                System.out.println("NE");
            }else {
                System.out.println("DA");
            }
        }
    }
}
