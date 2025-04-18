package src.cote0409;

import java.util.ArrayList;
import java.util.Scanner;

public class back3460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0;i<N;i++){
            int val = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            while (val >0){
                if(val %2 == 1) list.add(1);
                else list.add(0);
                val = val/2;
            }

            for(int j=0;j<list.size();j++){
                if(list.get(j) == 1){
                    System.out.print(j+ " " );
                }
            }
        }
    }
}
