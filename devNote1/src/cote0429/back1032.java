package src.cote0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class back1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char [][]c = new char[n][];
        char []standard = new char[n];
        for(int i=0;i<n;i++){
            c[i] = br.readLine().toCharArray();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<c.length;i++){
            standard = c[i-1];
            for(int j=0;j<c[i].length;j++){
                if(standard[j] != c[i][j]){
                    set.add(j);
                }
            }
        }
        for(int i=0;i<c[0].length;i++){
            if (set.contains(i)) {
                System.out.print("?");
            }else{
                System.out.print(c[0][i]);
            }
        }
    }
}
