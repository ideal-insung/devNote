package src.cote0409;

import java.util.Scanner;

public class back10833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int student = sc.nextInt();
            int apple = sc.nextInt();
            sum+= apple%student;
        }
        System.out.println(sum);
    }
}
