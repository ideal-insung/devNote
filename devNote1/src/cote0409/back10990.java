package src.cote0409;

import java.util.Scanner;

public class back10990 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // 공백 먼저 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // 첫 번째 별
            System.out.print("*");

            // 두 번째 별 (i가 0이면 출력하지 않음)
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
