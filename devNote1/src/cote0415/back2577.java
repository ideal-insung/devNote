package src.cote0415;

import java.util.Scanner;

public class back2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        char[] s = String.valueOf((a*b*c)).toCharArray();
        int chk[] = new int[10];
        for(int i=0;i<s.length;i++){
            for(int j=0;j<chk.length;j++){
                if(s[i]-'0' == j){
                    chk[j]++;
                }
            }
        }

        for(int d : chk){
            System.out.println(d);
        }
    }
}
