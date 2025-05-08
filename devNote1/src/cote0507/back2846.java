package src.cote0507;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class back2846 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]- arr[i-1] > 0){
                sum+=arr[i]- arr[i-1];
                if(i == arr.length-1) result.add(sum);
            }else{
                result.add(sum);
                sum = 0;
            }
        }

        if(result.isEmpty()){
            System.out.println(0);
        }else{
            int max = Collections.max(result);
            System.out.println(max);
        }
    }
}
