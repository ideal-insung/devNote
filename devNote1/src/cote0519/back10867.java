package src.cote0519;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class back10867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int a : set){
            list.add(a);
        }

        Collections.sort(list);

        for(int a : list){
            System.out.print(a+ " ");
        }
    }
}
