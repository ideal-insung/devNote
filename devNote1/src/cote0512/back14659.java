package src.cote0512;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class back14659 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for(int j=0;j<arr.length;j++){
            int kill = 0;
            max = arr[j];
            for(int k=j+1;k<arr.length;k++){
                if(arr[k] < max){
                    kill++;
                }else{
                    break;
                }
            }
            list.add(kill);
        }

        System.out.println(Collections.max(list));
    }
}
