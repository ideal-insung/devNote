package src.cote0512;

import java.util.Scanner;

public class back1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0;i<n;i++){
            String s = sc.next();
            if(isGroup(s)){
                cnt++;
            }
        }
            System.out.println(cnt);
    }

    private static boolean isGroup(String s) {
        boolean isGroup = true;
        int []atoz= new int[27];
        char []arr = s.toCharArray();

        for(int i=0;i<arr.length;i++){
            char tmp;
            if(i==0) tmp ='*';
            else tmp = arr[i-1];
            if(tmp != arr[i]){
                if(atoz[(int)arr[i]-97] > 0){
                    isGroup = false;
                }
            }
            atoz[(int)arr[i]-97]++;
        }
        return isGroup;
    }
}
