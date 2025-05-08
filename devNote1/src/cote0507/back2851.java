package src.cote0507;

import java.util.Scanner;

public class back2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int result = 0;
        for(int i=0;i<10;i++){
            int point = sc.nextInt();
            sum += point;

            // 조건: 현재 sum이 이전보다 100에 가까우면 갱신
            if (Math.abs(100 - sum) <= Math.abs(100 - result)) {
                result = sum;
            }
        }
        System.out.println(result);
    }
}

