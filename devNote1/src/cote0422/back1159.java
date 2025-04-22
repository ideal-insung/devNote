package src.cote0422;

import java.util.Scanner;

public class back1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] arr= new char[26];
        int [] numArr = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i] = (char)(i+97);
        }

        for(int i=0;i<n;i++){
            char c = sc.next().charAt(0);
            for(int j=0;j<arr.length;j++){
                if(arr[j] == c){
                    numArr[j] ++;
                }
            }
        }
        boolean flag = false;
        for(int i=0;i<numArr.length;i++){
            if(numArr[i] >= 5){
                flag = true;
                System.out.print((char)(i+97));
            }
        }
        if(!flag){
            System.out.println("PREDAJA");
        }
    }
}
