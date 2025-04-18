package src.cote0407;

import java.util.Scanner;

public class back5073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int []arr = new int[3];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if (arr[j] > arr[j+1]){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
            if(arr[0] == 0 && arr[1] == 0 && arr[2] ==0) break;
            if(arr[2] >= arr[0]+arr[1]){
                System.out.println("Invalid");
            }else {
                if(arr[0] == arr[1] && arr[1] == arr[2]){
                    System.out.println("Equilateral");
                }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]){
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene");
                }
            }
        }
    }
}
