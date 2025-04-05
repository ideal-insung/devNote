package cote0403;
/*
8 16
32 4
17 5
0 0 

factor
multiple
neither
*/
import java.util.Scanner;

public class back5086 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x == y) break;
			
			if(x!=0 && y!=0 &&x<y && y%x == 0) {
				System.out.println("factor");
			}else if(x!=0 && y!=0 &&x>y && x%y ==0) {
				System.out.println("multiple");
			}else if(x!=0 && y!=0 && x%y != 0){
				System.out.println("neither");
			}
		}
	}
}
