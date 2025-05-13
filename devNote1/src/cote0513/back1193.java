package src.cote0513;

import java.util.Scanner;

public class back1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int group = 1;
        int total = 1;
        while(total< n){
            group++;
            total += group;
        }

        int idx = n - (total -group);
        int sum = group+1;
        int left, right;
        if(group%2 == 0){
            right = sum-idx;
            left = idx;
        }else{
            left = sum-idx;
            right = idx;
        }

        System.out.println(left+"/"+right);
    }
}
