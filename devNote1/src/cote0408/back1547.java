package src.cote0408;

import java.util.Scanner;

public class back1547 {
    public static int findIdx(int arr[], int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==val){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int []cup = new int[4];
        for(int i=0;i<cup.length;i++){
            cup[i] = i;
        }

        int N = scanner.nextInt();
        for(int i=1;i<N+1;i++){
            int x = scanner.nextInt();
            x = findIdx(cup,x);
            int y = scanner.nextInt();
            y = findIdx(cup,y);

            int tmp=0;

            tmp = cup[x];
            cup[x] = cup[y];
            cup[y] = tmp;
        }
        System.out.println(cup[1]);
    }
}
