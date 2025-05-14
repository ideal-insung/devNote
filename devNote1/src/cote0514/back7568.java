package src.cote0514;

import java.util.Scanner;

public class back7568 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for(int []a : arr){
            int cnt = 1;
            for(int []b : arr){
                if(a[0] < b[0] && a[1] < b[1]){
                    cnt++;
                }
            }
            System.out.print(cnt+ " " );
        }

    }
}
