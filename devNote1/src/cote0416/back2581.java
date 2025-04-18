package src.cote0416;

import java.util.ArrayList;
import java.util.Scanner;

public class back2581 {
    public static boolean isPrime(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) cnt++;
        }
        return cnt == 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) list.add(i);
        }

        if(!list.isEmpty()){
            int sum= 0;
            for(int a : list){
                sum+=a;
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }else{
            System.out.println(-1);
        }
    }
}
