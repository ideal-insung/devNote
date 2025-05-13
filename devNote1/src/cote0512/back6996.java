package src.cote0512;

import java.util.Scanner;

public class back6996 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.next();
            String s2 = sc.next();

            if(isAnagram(s,s2)){
                System.out.println(s+" & "+s2 + " are anagrams.");
            }else{
                System.out.println(s+" & "+s2 + " are NOT anagrams.");
            }
        }
    }

    private static boolean isAnagram(String s, String s2) {
        char []arr = s.toCharArray();
        char []arr2 = s2.toCharArray();

        int []atoz1 = new int[26];
        int []atoz2 = new int[26];

        boolean  isSame = true;
        for(int i=0;i<arr.length;i++){
            atoz1[(int)arr[i]-97]++;
        }

        for(int j=0;j<arr2.length;j++){
            atoz2[(int)arr2[j]-97]++;
        }

        for(int i=0;i<26;i++){
            if(atoz1[i] != atoz2[i]){
                isSame = false;
            }
        }
        return isSame;
    }
}
