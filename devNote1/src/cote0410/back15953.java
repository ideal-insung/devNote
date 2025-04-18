package src.cote0410;

import java.util.Scanner;

public class back15953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] ={500,300,300,200,200,200,50,50,50,50,30,30,30,30,30,10,10,10,10,10,10};
        int b[] = {512,256,256,128,128,128,128,64,64,64,64,64,64,64,64,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32};

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a1 = scanner.nextInt();
            int b1 = scanner.nextInt();

            int prizeA = 0;
            int prizeB = 0;

            if (a1 > 0 && a1 <= a.length) {
                prizeA = a[a1 - 1];
            }

            if (b1 > 0 && b1 <= b.length) {
                prizeB = b[b1 - 1];
            }

            System.out.println((prizeA + prizeB) * 10000);
        }

        scanner.close();
    }
}
