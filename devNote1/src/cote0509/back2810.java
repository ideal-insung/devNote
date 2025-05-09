package src.cote0509;

import java.util.Scanner;

public class back2810 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        char [] arr = new char[n];
        arr = sc.next().toCharArray();

        int cnt = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'S'){
                cnt ++ ;
            }else if(arr[i] == 'L'){
                i++;
                cnt++;
                continue;
            }
            if(cnt >= n){
                cnt = n;
            }
        }
        System.out.println(cnt);
    }

}
