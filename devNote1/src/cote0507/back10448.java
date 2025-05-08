package src.cote0507;

import java.util.ArrayList;
import java.util.Scanner;

public class back10448 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(isThreeNum(num)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }

    }

    private static boolean isThreeNum(int num) {
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;(i*(i+1))/2<num;i++){
            list.add((i*(i+1))/2);
        }

        for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                for(int k=j;k<list.size();k++){
                    if(list.get(i) + list.get(j) + list.get(k) == num){
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
