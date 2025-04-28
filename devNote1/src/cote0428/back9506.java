package src.cote0428;

import java.util.ArrayList;
import java.util.Scanner;

public class back9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == -1) break;
            ArrayList<Integer> list = isPerfect(n);

            if(list != null){
                System.out.print(n + "=");
                for(int i=0;i<list.size();i++){
                    if(i == list.size()-1) System.out.print(list.get(i));
                    else System.out.print(list.get(i) + " + ");
                }
            }else{
                System.out.println(n + " is NOT perfect.");
            }
        }
    }

    private static ArrayList<Integer> isPerfect(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0 ;
        for(int i=1;i<n;i++){
            if(n%i == 0) list.add(i);
        }
        for(int a : list){
            sum+=a;
        }

        if(sum == n ){
            return list;
        }else{
            return null;
        }

    }
}
