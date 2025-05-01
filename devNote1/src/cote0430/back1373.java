package src.cote0430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.length()%3 == 1){
            s = "00"+s;
        }else if(s.length()%3 == 2){
            s = "0"+s;
        }

        for(int i = 0;i<s.length();i+=3){
            getNum(s.substring(i,i+3));
        }
    }

    private static void getNum(String s) {
        char []c = s.toCharArray();
        int []a = new int[c.length];
        for(int i=0;i<c.length;i++){
            a[i] = c[i] - '0';
        }
        int sum = 4*a[0] + 2*a[1] + a[2];
        System.out.print(sum);
    }
}
