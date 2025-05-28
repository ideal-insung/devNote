package src.cote0528;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class back5635 {
    static class Person {
        String name;
        int year;
        int month;
        int day;

        public Person(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String v_name = sc.next();
            int v_day = sc.nextInt();
            int v_month = sc.nextInt();
            int v_year = sc.nextInt();
            list.add(new Person(v_name,v_year,v_month,v_day));
        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.year != o2.year){
                    return o1.year - o2.year;
                }

                if(o1.month != o2.month){
                    return o1.month - o2.month;
                }
                return o1.day - o2.day;
            }
        });

        System.out.println(list.get(list.size()-1).name);
        System.out.println(list.get(0).name);
    }

}
