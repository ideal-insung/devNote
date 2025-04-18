package src.cote0410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        for(int i=0;i<t;i++){
            String []txt = br.readLine().split(" ");
            int arr[] = new int[txt.length];
            int sum = 0;
            int min = Integer.MAX_VALUE;

            for(int j=0;j<arr.length;j++){
                if(Integer.parseInt(txt[j]) % 2 ==0){
                    arr[j] = Integer.parseInt(txt[j]);
                }
            }

            for(int j=0;j<arr.length;j++){
                if(arr[j] !=0){
                    sum+=arr[j];
                    if(min > arr[j]){
                        min = arr[j];
                    }
                }
            }
            System.out.println(sum + " " +min);
        }
    }
}
