package src.cote0416;

import java.util.Arrays;
import java.util.Scanner;

public class back2920 {
    public static String isWhat(int arr[]){
        int [] ascending = {1,2,3,4,5,6,7,8};
        int [] descending = {8,7,6,5,4,3,2,1};
        String what = "";

        if(Arrays.equals(ascending,arr)){
            what = "ascending";
        }else if(Arrays.equals(descending,arr)){
            what = "descending";
        }else{
            what = "mixed";
        }
        return what;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 8;
        int arr[] = new int[cnt];

        for(int i=0;i<cnt;i++){
            arr[i] = sc.nextInt();
        }

        String result = isWhat(arr);
        System.out.println(result);

    }
}
