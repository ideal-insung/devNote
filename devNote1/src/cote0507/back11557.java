package src.cote0507;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class back11557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            Map<String,Integer> map = new HashMap<>();
            for(int j =0;j<num;j++){
                map.put(sc.next(), sc.nextInt());
            }
            int max = map.values().stream().max(Integer::compareTo).orElse(-1);
            for(String key : map.keySet()){
                if(map.get(key) == max){
                    System.out.println(key);
                }
            }
        }
    }
}
