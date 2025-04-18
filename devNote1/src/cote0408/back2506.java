package src.cote0408;

import java.util.Scanner;

public class back2506 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        int cnt =0;
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
            if(arr[i] == 1){
                cnt+=1;
                sum+= cnt;
            }else{
                cnt = 0;
            }
        }
        System.out.println(sum);
    }
}
