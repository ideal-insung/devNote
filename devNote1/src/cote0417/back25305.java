package src.cote0417;

import java.util.Scanner;

public class back25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int member = sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int tmp = 0;
                    tmp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(arr[member-1]);
    }
}
