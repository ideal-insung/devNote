package src.cote0418;

import java.util.Scanner;

public class back15829 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        char []arr = new char[n];
        arr = sc.next().toCharArray();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            sum+=(c-96) * Math.pow(31,i);
        }

        System.out.println(sum);
    }
}
