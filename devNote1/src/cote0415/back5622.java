package src.cote0415;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class back5622 {
    public static int makeTime(HashMap<Integer, ArrayList<Character>> map,int key, int idx){
        if(key == 1) return 2;
        else return key+1;

    }
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Character>> map = new HashMap<Integer,ArrayList<Character>>();
        map.put(1, new ArrayList<Character>());
        map.put(2, new ArrayList<Character>(Arrays.asList('A','B','C')));
        map.put(3, new ArrayList<Character>(Arrays.asList('D','E','F')));
        map.put(4, new ArrayList<Character>(Arrays.asList('G','H','I')));
        map.put(5, new ArrayList<Character>(Arrays.asList('J','K','L')));
        map.put(6, new ArrayList<Character>(Arrays.asList('M','N','O')));
        map.put(7, new ArrayList<Character>(Arrays.asList('P','Q','R','S')));
        map.put(8, new ArrayList<Character>(Arrays.asList('T','U','V')));
        map.put(9, new ArrayList<Character>(Arrays.asList('W','X','Y','Z')));

        Scanner scanner = new Scanner(System.in);
        char arr [] = scanner.next().toCharArray();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=map.size();j++){
                int idx = map.get(j).indexOf(arr[i]);
                if(idx != -1){
                    sum += makeTime(map,j,idx);
                }
            }
        }
        System.out.println(sum);





    }
}
