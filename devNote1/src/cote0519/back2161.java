package src.cote0519;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class back2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            que.offer(i);
        }

        while(!que.isEmpty()){
            if(que.size() == 1) System.out.print(que.poll()+" ");
            else{
                System.out.print(que.poll()+" ");
                int s = que.poll();
                que.offer(s);
            }
        }
        System.out.println();

    }
}
