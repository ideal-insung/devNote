package src.cote0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class back1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();

        if(input.isEmpty()){
            System.out.println(0);
        }else{
            String arr[] = input.split("\\s+");
            System.out.println(arr.length);
        }

    }
}
