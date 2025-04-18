package src.cote0410;

import java.util.Scanner;

public class back1284 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String num = scanner.next();
            if(num.equals("0")) break;
            int sum = 0;
            int []arr = new int[num.length()];

            for(int i=0;i<arr.length;i++){
                arr[i] = num.charAt(i) - '0';
            }
            for(int j=0;j<arr.length;j++){
                if(arr.length == 1 && arr[0] == 0) break;
                if(arr[j] == 1)sum +=2;
                else if(arr[j] == 0 ) sum+=4;
                else sum+=3;
            }

            sum+= arr.length+1;
            System.out.println(sum);
        }
    }
}
