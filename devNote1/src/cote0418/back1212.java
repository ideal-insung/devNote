package src.cote0418;

import java.util.ArrayList;
import java.util.Scanner;

public class back1212 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();

        for(int i=0;i<n.length;i++){
            if(i == 0){
                if(n[i] == '0') System.out.print("0");
                else if(n[i] == '1') System.out.print("1");
                else if(n[i] == '2') System.out.print("10");
                else if(n[i] == '3') System.out.print("11");
            }else{
                if(n[i] == '0') System.out.print("000");
                else if(n[i] == '1') System.out.print("001");
                else if(n[i] == '2') System.out.print("010");
                else if(n[i] == '3') System.out.print("011");
            }
            if(n[i] == '4') System.out.print("100");
            else if(n[i] == '5') System.out.print("101");
            else if(n[i] == '6') System.out.print("110");
            else if(n[i] == '7') System.out.print("111");
        }

    }
}
