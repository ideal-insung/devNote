package src.cote0516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class back7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            String name = s.split(" ")[0];
            String cmd = s.split(" ")[1];
            if (cmd.equals("enter")) {
                set.add(name);
            } else if (cmd.equals("leave")) {
                set.remove(name);
            }
        }
        List<String> result = new ArrayList<>(set);
        Collections.sort(result, Collections.reverseOrder());

        for(String sv : result){
            System.out.println(sv);
        }
        
    }
}
