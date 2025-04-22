package src.cote0422;

import java.util.Arrays;
import java.util.Scanner;

public class back2309 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] = new int[9];
        int sum = 0;
        for(int i=0;i<9;i++){
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }

        int x = 0;
        int y = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(sum - 100 == arr[i]+arr[j]){
                    x = arr[i];
                    y = arr[j];
                }
            }
        }

        Arrays.sort(arr);

        for(int a : arr){
            if(a!=x && a!=y){
                System.out.println(a+" ");
            }
        }
    }
}
