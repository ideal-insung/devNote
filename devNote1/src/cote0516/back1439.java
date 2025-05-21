package src.cote0516;

import java.util.Scanner;

public class back1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr= sc.next().toCharArray();
        int cnt=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] != arr[i]){
                cnt++;
            }
        }
        System.out.println((cnt+1)/2);
    }
}
