package src.cote0516;

import java.util.Scanner;

public class back2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]arr = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int x_start = sc.nextInt();
            int y_start = sc.nextInt();
            int x_end = sc.nextInt();
            int y_end = sc.nextInt();
            int sum = 0;
            for(int j=x_start;j<=x_end;j++){
                for(int q=y_start;q<=y_end;q++){
                    sum+=arr[j][q];
                }
            }
            System.out.println(sum);
        }
    }


}
