package src.cote0407;

import java.util.Scanner;

public class back2903 {
    public static int center(int N){
        return (int)(Math.pow(Math.pow(2,N)+1,2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(center(N));
    }
}
