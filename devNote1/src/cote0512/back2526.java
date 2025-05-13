package src.cote0512;

import java.util.*;

public class back2526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int cnt = banbok(n,p);
        System.out.println(cnt);
    }

    private static int banbok(int n, int p) {
        Map<Integer,Integer> map = new HashMap<>();
        int curr = n;
        int idx = 0;

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        while(!set.contains(curr)){
            set.add(curr);
            list.add(curr);
            curr = (curr * n) % p;
        }

        int startIdx = list.indexOf(curr);
        return list.size()-startIdx;
    }
}
