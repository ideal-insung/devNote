package src.cote0429;

import java.util.Scanner;
/*
1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6...
3 7
15 -> 2+3+3+3+4
*/
public class back1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr = new int[1001];
        int x =0;
        for(int i=0;i<arr.length-1;i++){
            int y = i+1;
            for(int j=0;j<=i && x < arr.length-1 ;j++){
                arr[x] = y;
                x++;
            }
        }

        int sum = 0;
        for(int i = n-1; i<m;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
