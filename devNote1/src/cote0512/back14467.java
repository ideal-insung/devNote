package src.cote0512;

import java.util.HashMap;
import java.util.Scanner;

public class back14467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<n;i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            if(map.containsKey(key)){
               if(map.get(key) + val == 1){
                   cnt ++;
                   map.put(key, val);
               }
            }else{
                map.put(key, val);
            }
        }
        System.out.println(cnt);
    }
}
