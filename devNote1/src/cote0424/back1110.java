package src.cote0424;

import java.util.Scanner;

public class back1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(Integer.parseInt(n) < 10) n ="0"+n;
        int cycle = getCycle(n);
        System.out.println(cycle);
    }

    private static int getCycle(String n) {
        int num = Integer.parseInt(n);
        int tmp = num;
        int cnt = 0;
        while(tmp != num || cnt == 0){
            int first = num/10;
            int second = num%10;
            int c = getOne(first,second);
            num = second*10 + c;
            cnt ++ ;
        }
        return cnt;
    }

    private static int getOne(int first, int second) {
        return (first+second)%10;
    }
}
