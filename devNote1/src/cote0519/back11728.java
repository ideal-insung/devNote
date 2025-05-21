package src.cote0519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class back11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] A = new int[n];
        int[] B = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) B[i] = Integer.parseInt(st.nextToken());

        int i=0;
        int j=0;
        int idx = 0;
        int[] result = new int[n+m];

        while(i<n && j<m){
            if(A[i] <= B[j]){
                sb.append(A[i++]).append(" ");
            }else{
                sb.append(B[j++]).append(" ");
            }
        }

        while(i<n){
            sb.append(A[i++]).append(" ");
        }

        while(j<m){
            sb.append(B[j++]).append(" ");
        }

        System.out.println(sb);
    }
}
