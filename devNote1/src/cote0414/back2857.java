package src.cote0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean []chk = new boolean[5];
        int i=0;
        boolean flag = false;
        while(i<5){
            String text = br.readLine();
            if(text.indexOf("FBI") == -1){
                chk[i] = false;
            }else{
                chk[i] = true;
                flag = true;
            }
            i++;
        }
        if(!flag){
            System.out.println("HE GOT AWAY!");
        }else{
            for(int j=0;j<chk.length;j++){
                if(chk[j]) System.out.print((j+1)+ " ");
            }
        }
    }
}
