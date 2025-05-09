package src.cote0509;

import java.util.Scanner;

public class back1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][]arr = new char[n][m];

        for(int i=0;i<n;i++){
            String s = sc.next();
            arr[i] = s.toCharArray();
        }

        int col_cnt = 0;
        int row_cnt = 0;
        boolean []row = new boolean[n];
        boolean []col = new boolean[m];
        for(int i=0;i<n;i++){
            boolean guard = false;
            for(int j=0;j<m;j++){
                if(arr[i][j] == 'X'){
                    guard = true;
                    break;
                }

            }
            if(!guard){
                row[i] = true;
            }
        }

        for(int j=0;j<m;j++){
            boolean guard = false;
            for(int i=0;i<n;i++){
                if(arr[i][j] == 'X'){
                    guard = true;
                    break;
                }

            }
            if(!guard){
                col[j] = true;
            }
        }


        for(boolean b : col){
            if(b) col_cnt ++;
        }

        for(boolean b : row){
            if(b) row_cnt ++;
        }

        System.out.println(Math.max(col_cnt, row_cnt));
    }
}
