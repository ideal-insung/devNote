package src.cote0513;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class back10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> s = new ArrayList<>();
        for(int i=0;i<n;i++){
            String txt = sc.nextLine();
            txt = txt+" " +i;
            s.add(txt);
        }

        Collections.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int age1 = Integer.parseInt(o1.split(" ")[0]);
                int age2 = Integer.parseInt(o2.split(" ")[0]);
                int idx1 = Integer.parseInt(o2.split(" ")[2]);
                int idx2 = Integer.parseInt(o2.split(" ")[2]);

                if(age1 == age2){
                    return idx1 - idx2;
                }
                return age1 - age2;
            }
        });

        for(String t : s){
            StringBuffer sb =new StringBuffer(t);
            int idx = t.lastIndexOf(" ");
            int lastIdx = t.length();
            sb.delete(idx,lastIdx);
            System.out.println(sb);
        }
    }
}
