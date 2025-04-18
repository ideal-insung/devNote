package src.cote0414;

import java.util.Scanner;

public class back2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            int cnt = scanner.nextInt();
            String txt = scanner.next();
            char [] arr = txt.toCharArray();
            String result ="";
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<cnt;k++){
                    result+= arr[j];
                }
            }
            System.out.println(result);

        }
    }
}
