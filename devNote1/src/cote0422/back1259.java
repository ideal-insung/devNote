package src.cote0422;

import java.util.Scanner;

public class back1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = scanner.nextInt();
            if( x == 0 ) break;
            String txt = String.valueOf(x);

            if(isPalindrome(txt) == 1){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

    private static int isPalindrome(String s) {
        return recursion(s,0,s.length()-1);
    }

    private static int recursion(String s, int i, int j) {
        if(i >= j) return 1;
        else if(s.charAt(i) != s.charAt(j)) return 0;
        else return recursion(s,i+1,j-1);
    }
}
