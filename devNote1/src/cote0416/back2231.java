package src.cote0416;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class back2231 {
    public static int devideSum(int n){
        int tmp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            int sum = 0;
            tmp = i;
            while(tmp>0){
                sum+=tmp%10;
                tmp =tmp/10;
            }
            if(i+sum == n){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            return 0;
        }else{
            Collections.sort(list);
            return list.get(0);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = devideSum(n);
        System.out.println(result);
    }
}
