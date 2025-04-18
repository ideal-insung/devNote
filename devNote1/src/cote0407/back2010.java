package src.cote0407;

import java.util.Scanner;

public class back2010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] arr = new int[N];
        int sum = 0;

        for (int i=0;i<N;i++){
            arr[i] = scanner.nextInt();
            if(i == N-1){
                sum+=arr[i];
            }else{
                sum+=arr[i]-1;
            }
        }
        System.out.println(sum);
    }

}
