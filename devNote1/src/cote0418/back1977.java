package src.cote0418;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class back1977 {
    public static ArrayList<Integer> getPosList(int n, int m){
        ArrayList<Integer> result = new ArrayList<>();
        // 1부터 100까지 제곱수를 구하여 result에 추가
        for (int i = 1; i * i <= m; i++) {
            int square = i * i;
            if (square >= n) {
                result.add(square);  // n 이상, m 이하 제곱수를 추가
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = getPosList(n,m);
        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            int sum = 0;
            for(int a : list){
                sum+=a;
            }
            System.out.println(sum + " " +list.get(0));
        }
    }
}
