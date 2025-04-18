package src.cote0415;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class back2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        for(int a : list){
            System.out.println(a);
        }
    }
}
