package src.cote0415;

import java.util.ArrayList;
import java.util.Scanner;

public class back1978 {
    public static boolean isDecimal(int n){
        boolean isDecimal = false;
        ArrayList<Integer> arr=  new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                arr.add(i);
            }
        }
        if(arr.size() == 2){
            isDecimal = true;
        }

        return isDecimal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt =0 ;
        for(int i=0;i<n;i++){
            if(isDecimal(scanner.nextInt())){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
