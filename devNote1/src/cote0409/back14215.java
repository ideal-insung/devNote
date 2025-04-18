package src.cote0409;

import java.util.Scanner;

public class back14215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        if(arr[2] >= arr[0]+arr[1]){
            arr[2] = arr[0]+arr[1]-1;
        }
        int sum =0 ;
        for(int i : arr){
            sum+=i;
        }
        System.out.println(sum);
    }
}
