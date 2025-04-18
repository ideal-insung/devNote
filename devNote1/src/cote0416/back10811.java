package src.cote0416;

import java.util.Scanner;

public class back10811 {
    public static void change(int []arr,int x, int y){
        while (x < y) {
            int tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
            x++;
            y--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int [n+1];
        for(int i=1;i<n+1;i++){
            arr[i] = i;
        }

        for(int i=0;i<m;i++){
            change(arr,sc.nextInt(),sc.nextInt());
        }
        for(int i=1;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
