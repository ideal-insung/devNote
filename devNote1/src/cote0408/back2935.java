package src.cote0408;

import java.math.BigInteger;
import java.util.Scanner;

public class back2935 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        BigInteger N = new BigInteger(scanner.nextLine());
        String s = scanner.nextLine();
        BigInteger M = new BigInteger(scanner.nextLine());

        if(s.equals("+")){
            System.out.println(N.add(M));
        }else {
            System.out.println(N.multiply(M));
        }
    }
}
