package src.cote0515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class back11723 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder stb = new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            if(s.equals("add")){
                if(list.indexOf(num) == -1){
                    list.add(num);
                }
            }else if(s.equals("remove")){
                if(list.indexOf(num) >= 0){
                    list.remove(list.indexOf(num));
                }
            }else if(s.equals("check")){
                if(list.indexOf(num) == -1){
                    stb.append(0).append('\n');
                }else{
                    stb.append(1).append('\n');
                }
            }else if(s.equals("toggle")){
                if(list.indexOf(num) == -1){
                    list.add(num);
                }else{
                    list.remove(list.indexOf(num));
                }
            }else if(s.equals("all")){
                list.clear();
                for(int j=1;j<=20;j++){
                    list.add(j);
                }
            }else if(s.equals("empty")){
                list.clear();
            }
        }
        System.out.println(stb);
    }
}
