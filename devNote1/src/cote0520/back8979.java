package src.cote0520;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class back8979 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        Map<Integer, Integer[]> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int country = sc.nextInt();
            Integer[] arr= {sc.nextInt(),sc.nextInt(),sc.nextInt()};
            map.put(country, arr);
        }
        Integer []targetArr = map.get(target);
        map.remove(targetArr);

        int cnt = 0;
        for(Integer[] arr : map.values()){
            int i=0;
            while(i<3){
                if(arr[i] != targetArr[i] && arr[i] > targetArr[i]){
                    cnt++;
                    break;
                }else if(arr[i] != targetArr[i] && arr[i] < targetArr[i]){
                    break;
                }else{
                    i++;
                }
            }
        }

        System.out.println(cnt+1);
    }
}
