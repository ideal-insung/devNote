package src.cote0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class back9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            String s = br.readLine();
            String sa[] = s.split(" ");
            for(int j=0;j<sa.length;j++){
                String txt = getReverse(sa[j]);
                System.out.print(txt);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static String getReverse(String s) {
        char []c = s.toCharArray();
        String t = "";
        for(int i=c.length-1;i>=0;i--){
            t+=c[i];
        }
        return t;
    }
}
