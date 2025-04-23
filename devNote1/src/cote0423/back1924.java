package src.cote0423;

import java.util.Scanner;

public class back1924 {
    public static void main(String[] args) {
        int [] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
        String []week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        Scanner sc= new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        int days = 0;
        for(int i=0;i<month-1;i++){
            days += lastDay[i];
        }
        days += day;
        int idx = days%week.length-1;

        if(idx == -1){
            idx = idx+week.length;
        }

        System.out.println(week[idx]);
    }
}
