package src.cote0407;

import java.util.Scanner;

public class back5565 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int idx = 9;
        while (idx > 0){
            price -= scanner.nextInt();
            idx --;
        }
        System.out.println(price);
    }
}
