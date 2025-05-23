package src.cote0422;

import java.util.Scanner;

public class back1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int result = getMaxDevide(arr);
        System.out.println(result);

    }

    private static int getMaxDevide(int[] arr) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : arr){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }

        result = min*max;
        return result;
    }
}
