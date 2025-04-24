package src.cote0424;

import java.util.Scanner;

public class back4344 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            int m = scanner.nextInt();
            int []arr = new int[m];
            double sum = 0.0;
            for(int j=0;j<m;j++){
                arr[j] = scanner.nextInt();
                sum+=arr[j];
            }
            double percent = getPercent(arr, sum);
            System.out.printf("%.3f", percent);
            System.out.print("%");
            System.out.println();
        }
    }


    public static double getPercent(int []arr , double sum){
        double size = arr.length;
        double overSize = 0;
        double avg = Math.round(sum/size * 10000.0) / 10000.0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > avg){
                overSize ++;
            }
        }
        double avgOver = overSize/size * 100;
        return Math.round(avgOver * 1000.0) / 1000.0;


    }
}
