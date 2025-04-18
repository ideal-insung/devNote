package src.cote0410;

import java.util.Scanner;

public class back2965 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(b-a > c-b){
            System.out.println(b-a-1);
        }else{
            System.out.println(c-b-1);
        }
    }
}
