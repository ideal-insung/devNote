package src.cote0421;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class back1076 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
        String []colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};

        for(int i=0;i<10;i++){
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(i);
            sublist.add((int)Math.pow(10,i));
            map.put(colors[i],sublist);
        }

        Scanner sc = new Scanner(System.in);
        String []arr = new String[3];
        for(int i=0;i<3;i++){
            arr[i] = sc.next();
        }

        long a = map.get(arr[0]).get(0) * 10;
        long b = map.get(arr[1]).get(0);
        long c = map.get(arr[2]).get(1);

        System.out.println((a+b)*c);
    }
}
