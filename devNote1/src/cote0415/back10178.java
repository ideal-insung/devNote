package src.cote0415;

import java.util.Scanner;

public class back10178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            int cnt = scanner.nextInt();
            int child = scanner.nextInt();

            System.out.println("You get "+cnt/child+" piece(s) and your dad gets "+cnt%child+" piece(s).");
        }
    }
}
