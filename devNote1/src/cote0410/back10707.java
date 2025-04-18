package src.cote0410;

import java.util.Scanner;

public class back10707 {
    public static int X(int x_price,int total){
        int sum = 0;
        sum = x_price * total;
        return sum;
    }
    public static int Y(int price, int over , int perLiter, int total){
        int sum =0;
        sum = price;
        if(total >= over){
            sum+=(total-over) * perLiter;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x_price = scanner.nextInt();
        int y_basic_P = scanner.nextInt();
        int y_overP = scanner.nextInt();
        int y_perLiter = scanner.nextInt();
        int total = scanner.nextInt();

        if(X(x_price,total) < Y(y_basic_P,y_overP,y_perLiter,total)){
            System.out.println(X(x_price,total));
        }else{
            System.out.println(Y(y_basic_P,y_overP,y_perLiter,total));
        }


    }
}
