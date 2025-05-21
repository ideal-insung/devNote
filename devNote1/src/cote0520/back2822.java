package src.cote0520;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class back2822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer []arr= new Integer[8];
        for(int i=0;i<8;i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> copyList = Arrays.asList(Arrays.copyOf(arr,arr.length));

        Arrays.sort(arr, Collections.reverseOrder());

        int sum = 0;
        int []rank_arr = new int[5];
        for(int j=0;j<5;j++){
            sum+= arr[j];
            rank_arr[j] = copyList.indexOf(arr[j]) + 1;
        }

        Arrays.sort(rank_arr);
        System.out.println(sum);
        for(int a : rank_arr){
            System.out.print(a+ " ");
        }
    }
}
