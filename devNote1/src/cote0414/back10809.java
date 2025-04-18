package src.cote0414;

import java.util.Scanner;

public class back10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.next();

        char[] arr = txt.toCharArray();

        int atoz_num[] = new int[26];
        for(int i=0;i<atoz_num.length;i++) atoz_num[i] = -1;
        char atoz_char [] = new char[26];
        int i=0;
        for(char c = 'a';c<='z';c++){
            atoz_char[i] = c;
            i++;
        }

        for(char a: arr){
            for(int j=0;j<atoz_char.length;j++){
                if(a == atoz_char[j]){
                    atoz_num[j] = txt.indexOf(a);
                }
            }
        }

        for(int a : atoz_num){
            System.out.print(a + " ");
        }

    }
}
