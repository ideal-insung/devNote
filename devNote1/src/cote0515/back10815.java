package src.cote0515;

import java.util.Arrays;
import java.util.Scanner;

public class back10815 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int [] target = new int[m];
        for(int j=0;j<m;j++){
            target[j] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int k=0;k<target.length;k++){
            if(Arrays.binarySearch(arr,target[k]) >= 0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
    }
}
