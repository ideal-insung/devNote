package src.cote0417;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class back1009 {
    public static int makeOne(int n){
        return n % 10;
    }
    public static ArrayList<Integer> makeList(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int base = x % 10;
        int tmp = base;
        list.add(tmp);

        for (int i = 1; i < 100; i++) {
            tmp = (tmp * base) % 10;
            if (list.get(0) == tmp) break;
            list.add(tmp);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            ArrayList<Integer>list = makeList(x);
            int size =list.size();
            int idx = (y % size == 0) ? size - 1 : (y % size) - 1;
            int result = list.get(idx);
            System.out.println(result == 0 ? 10 : result);

        }
    }
}
