package src.cote0418;

import java.util.ArrayList;
import java.util.Scanner;

public class back1212 {
    public static void getTwo(int n){

        /*if (n == 0) {
            System.out.print("0");
            return;
        }

        ArrayList<Integer>list =new ArrayList<>();
        while(n>0) {
            list.add(n % 2);
            n = n / 2;
        }

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i));
        }*/

        String binary = Integer.toBinaryString(n);

        // 3. 출력
        System.out.println(binary);
    }

    public static int getTen(String n){
        char arr[] = n.toCharArray();
        int size = arr.length;
        int sum = 0;
        for(int i=size-1;i>=0;i--){
            char c = arr[size-1-i];
            sum+= (c-'0')* Math.pow(8,i);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int a = getTen(n);
        getTwo(a);
    }
}
