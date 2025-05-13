package src.cote0512;

public class back4673 {
    public static void main(String[] args) {
        for(int i=1;i<10000;i++){
            if(!isConst(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isConst(int num) {
        boolean isConst = false;


        for(int i=1;i<num;i++){
            int sum = i + sumOfDigits(i);
            if(sum == num){
                isConst = true;
            }
        }
        return isConst;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum+= num%10;
            num /= 10;
        }
        return sum;
    }
}
