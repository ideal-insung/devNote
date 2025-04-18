package src.cote0410;

import java.util.Scanner;

public class back10984 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int cnt = scanner.nextInt();
            int totalgrade = 0;
            double totalScore = 0.0;
            for(int j=0;j<cnt;j++){
                int grade = scanner.nextInt();
                float score = scanner.nextFloat();
                totalgrade += grade;
                totalScore+=(grade*score);
            }
            System.out.println(totalgrade +" " + (double)Math.round((totalScore/totalgrade)*10)/10);
        }
    }
}
