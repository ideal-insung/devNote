package src.cote0409;

import java.util.Scanner;

public class back9085 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            int m = scanner.nextInt();
            int []arr = new int[m];
            int sum=0;
            for(int j=0;j<m;j++){
                arr[j] = scanner.nextInt();
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
