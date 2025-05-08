package src.cote0507;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class back1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        int start = list.get(2);
        while(true){
            int cnt = 0;
            for(int i=0;i<5;i++){
                if(start%list.get(i) == 0) cnt ++;
            }
            if(cnt > 2) break;
            start++;
        }
        System.out.println(start);
    }
}
