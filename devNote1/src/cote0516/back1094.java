package src.cote0516;

import java.util.Scanner;

public class back1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int []arr = {64,32,16,8,4,2,1};
        int cnt = 0;
        while(x>0){
            for(int i=0;i<arr.length;i++){
                if(arr[i] > x) continue;
                else{
                    x = x-arr[i];
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

