package src.cote0515;

import java.util.Scanner;

public class back2563 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        boolean [][]paper = new boolean[100][100];
        int sum = 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    if(!paper[j][k]){
                        paper[j][k] = true;
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
