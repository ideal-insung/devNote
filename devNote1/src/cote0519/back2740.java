package src.cote0519;

import java.util.Scanner;

public class back2740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]arr1 = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][]arr2 = new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int [][]result = new int[n][y];
        for(int i=0;i<n;i++){
            for(int j=0;j<y;j++){
                for(int k=0;k<m;k++){
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<y;j++){
                System.out.print(result[i][j] + " " );
            }
            System.out.println();
        }
    }
}
