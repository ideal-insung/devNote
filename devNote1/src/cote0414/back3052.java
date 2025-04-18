package src.cote0414;

import java.util.HashSet;
import java.util.Scanner;

public class back3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 42;
        HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<10;i++){
            int val = scanner.nextInt();
            s.add(val%n);
        }
        System.out.println(s.size());
    }
}
