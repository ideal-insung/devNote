package src.cote0509;

import java.util.Scanner;

public class back2947 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];

        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    System.out.println(arr[0] + " " + arr[1] +  " " + arr[2] + " " +arr[3] + " "+ arr[4]);
                }
            }
        }
    }
}
