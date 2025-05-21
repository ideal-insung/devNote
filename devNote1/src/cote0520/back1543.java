package src.cote0520;

import java.util.Scanner;

public class back1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String q = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        int cnt = 0;
        int idx = sb.indexOf(q);
        while(idx != -1){
            sb.delete(idx , idx+q.length());
            cnt++;
            idx = sb.indexOf(q , idx);
        }

        System.out.println(cnt);
    }
}
