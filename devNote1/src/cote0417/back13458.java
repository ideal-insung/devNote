package src.cote0417;

import java.util.Scanner;

public class back13458 {
    public static long getSecondManager(long arr[], int c){
        long cnt = 0;
        int getCnt[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) { // 남은 학생이 있을 경우
                // 두 번째 감독이 처리할 수 있는 수는 `c`명이므로 나누고, 올림 처리를 해야 함
                long remaining = arr[i]; // 남은 학생 수
                cnt += (remaining + c - 1) / c; // 올림 방식으로 두 번째 감독 계산
            }
        }
        return cnt;
    }
    public static long[] getFirstManager(long []arr ,int b){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]- b;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        int a = scanner.nextInt();
        long arr[] = new long[a];
        for(int i=0;i<a;i++){
            arr[i] = scanner.nextInt();
        }

        int b = scanner.nextInt();
        int c = scanner.nextInt();

        long firstArr [] = getFirstManager(arr,b);
        sum = a;
        long secondCnt = getSecondManager(firstArr,c);
        System.out.println(sum+secondCnt);
    }
}
