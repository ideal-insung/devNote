package src.cote0417;

import java.util.Scanner;

public class back1550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[]arr = sc.nextLine().toCharArray();
        char[]reverse = new char[arr.length];
        int res = 0;
        for(int i=0;i<arr.length;i++){
            reverse[arr.length-1-i]=arr[i];
        }
        for(int i=0;i<reverse.length;i++){
            char c = reverse[i];
            int value;
            if(c >= '0' && c<='9'){
                value = c-'0';
            }else{
                value = c-'A'+10;
            }
            res += (int)Math.pow(16, i) * value;
        }
        System.out.println(res);

    }
}
