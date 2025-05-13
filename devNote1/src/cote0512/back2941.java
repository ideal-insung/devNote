package src.cote0512;

import java.util.Scanner;

public class back2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = find(s);
        System.out.println(cnt);
    }

    private static int find(String s) {
        int cnt =0 ;
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int []arrN = {2,2,3,2,2,2,2,2};
        StringBuffer sb = new StringBuffer(s);

        for(int i=0;i<arr.length;i++){
            while(sb.indexOf(arr[i]) >= 0){
                String tmp = "*";
                String sTemp ="";
                for(int j=0;j<arrN[i];j++){
                    sTemp = sTemp.concat(tmp);
                }
                sb = sb.replace(sb.indexOf(arr[i]), sb.indexOf(arr[i]) + arrN[i] , sTemp);
                cnt ++;
            }
        }

        char [] charArray = sb.toString().toCharArray();
        for(int k=0;k<charArray.length;k++){
            if(charArray[k] != '*'){
                cnt ++;
            }
        }
        return cnt;
    }
}
