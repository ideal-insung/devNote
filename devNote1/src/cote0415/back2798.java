package src.cote0415;

import java.util.ArrayList;
import java.util.Scanner;

public class back2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<=list.size()-2;i++){
            for(int j=i+1;j<list.size()-1;j++){
                for(int k=j+1;k<list.size();k++){
                    if(list.get(i) + list.get(j) + list.get(k) == m){
                        max = list.get(i) + list.get(j) + list.get(k);
                        break;
                    }else{
                        sum = list.get(i) + list.get(j) + list.get(k);
                        if(sum < m){
                            if(max < sum){
                                max = sum;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(max);

    }
}
