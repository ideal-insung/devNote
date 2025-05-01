package src.cote0430;

import java.util.Arrays;
import java.util.Scanner;

public class back2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n][10];
        for(int i =0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
            Arrays.sort(arr[i]);
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i][7]);
        }
    }
}
