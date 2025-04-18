package src.cote0408;

import java.util.Scanner;

public class back1267 {
    public static int[] phone(int arr[]){
        int total_Y = 0;
        int total_M = 0;

        for(int i=0; i<arr.length;i++){
            int time = arr[i];
            int sumY = 0;
            int sumM = 0;
            int Y = time/30;
            int M = time/60;
            sumY = Y*10+10;
            sumM = M*15+15;
            total_Y +=sumY;
            total_M +=sumM;
        }
        int []data = {total_Y,total_M};
        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int []arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = scanner.nextInt();
        }

        int[] data = phone(arr);
        if(data[0] > data[1]){
            System.out.println("M "+ data[1]);
        }else if(data[0] < data[1]){
            System.out.println("Y "+ data[0]);
        }else{
            System.out.println("Y M "+ data[0]);
        }
    }
}
