package src.cote0509;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class back14696 {
    public static void whoWin(ArrayList<Integer> listA , ArrayList<Integer> listB){
        HashMap<Integer,Integer> cntMapA = new HashMap<>();
        HashMap<Integer,Integer> cntMapB = new HashMap<>();

        for(int n : listA){
            cntMapA.put(n,cntMapA.getOrDefault(n,0) +1);
        }

        for(int n : listB){
            cntMapB.put(n,cntMapB.getOrDefault(n,0) +1);
        }

        for(int key = 1;key<=4;key++){
            cntMapA.putIfAbsent(key, 0 );
            cntMapB.putIfAbsent(key, 0 );
        }

        if(cntMapA.get(4) != cntMapB.get(4)){
            if(cntMapA.get(4) > cntMapB.get(4)) System.out.println("A");
            else                                System.out.println("B");
        }else{
            if(cntMapA.get(3) != cntMapB.get(3)){
                if(cntMapA.get(3) > cntMapB.get(3)) System.out.println("A");
                else                                System.out.println("B");
            }else{
                if(cntMapA.get(2) != cntMapB.get(2)){
                    if(cntMapA.get(2) > cntMapB.get(2)) System.out.println("A");
                    else                                System.out.println("B");
                }else{
                    if(cntMapA.get(1) != cntMapB.get(1)){
                        if(cntMapA.get(1) > cntMapB.get(1)) System.out.println("A");
                        else                                System.out.println("B");
                    }else{
                        System.out.println("D");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for(int i=0;i<2*n;i++){
            int num = sc.nextInt();
            if(i%2 == 0){
                for(int j=0;j<num;j++){
                    listA.add(sc.nextInt());
                }
            }else{
                for(int j=0;j<num;j++){
                    listB.add(sc.nextInt());
                }
            }
            if(i%2 != 0){
                whoWin(listA, listB);
                listA.clear();
                listB.clear();
            }
        }
    }
}
