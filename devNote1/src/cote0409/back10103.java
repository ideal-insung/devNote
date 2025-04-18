package src.cote0409;

import java.util.Scanner;

public class back10103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int c_score = 100;
        int s_score = 100;
        for(int i=0;i<N;i++){
            int c_dice = scanner.nextInt();
            int s_dice = scanner.nextInt();

            if(c_dice > s_dice){
                s_score -= c_dice;
            }else if(c_dice < s_dice){
                c_score -= s_dice;
            }
        }
        System.out.println(c_score);
        System.out.println(s_score);
    }
}
